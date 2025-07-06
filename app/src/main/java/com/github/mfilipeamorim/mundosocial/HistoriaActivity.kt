package com.github.mfilipeamorim.mundosocial.ui.historia

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.github.mfilipeamorim.mundosocial.R
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.model.CenarioEntity
import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity
import com.github.mfilipeamorim.mundosocial.data.model.HistoricoEntity
import com.github.mfilipeamorim.mundosocial.databinding.ActivityHistoriaBinding
import kotlinx.coroutines.launch

class HistoriaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHistoriaBinding
    private lateinit var historias: List<HistoriaEntity>
    private var historiasJaExibidas = mutableSetOf<Long>()
    private var dificuldadeAtual = 1
    private var acertosSeguidos = 0
    private var totalRespondidas = 0
    private var cenario: CenarioEntity? = null
    private var historiaAtual: HistoriaEntity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityHistoriaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botão de voltar
        findViewById<ImageButton>(R.id.btnVoltar)?.setOnClickListener { finish() }

        val cenarioId = intent.getLongExtra("cenarioId", -1L)
        if (cenarioId == -1L) {
            Toast.makeText(this, "Cenário inválido", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        binding.btnProximo.setOnClickListener {
            binding.btnProximo.isEnabled = false
            binding.btnProximo.visibility = android.view.View.GONE
            mostrarProximaHistoria()
        }

        val db = AppDatabase.getInstance(this)

        lifecycleScope.launch {
            cenario = db.cenarioDao().buscarPorId(cenarioId)
            historias = db.historiaDao().listarPorCenario(cenarioId)

            findViewById<TextView>(R.id.tituloTopo)?.text = cenario?.titulo ?: "Cenário"

            mostrarProximaHistoria()
        }

        binding.btnOpcao1.setOnClickListener { verificarResposta(1) }
        binding.btnOpcao2.setOnClickListener { verificarResposta(2) }
        binding.btnOpcao3.setOnClickListener { verificarResposta(3) }
    }

    private fun mostrarProximaHistoria() {
        if (totalRespondidas >= 10) {
            Toast.makeText(this, "Cenário concluído!", Toast.LENGTH_LONG).show()
            finish()
            return
        }

        val corNormal = android.graphics.Color.parseColor("#161B22")
        binding.btnOpcao1.setBackgroundColor(corNormal)
        binding.btnOpcao2.setBackgroundColor(corNormal)
        binding.btnOpcao3.setBackgroundColor(corNormal)

        val niveisPrioridade = listOf(dificuldadeAtual, 1, 2, 3).distinct()

        var selecionada: HistoriaEntity? = null

        for (nivel in niveisPrioridade) {
            val candidatas = historias.filter {
                it.dificuldadeNivel == nivel && !historiasJaExibidas.contains(it.id)
            }

            if (candidatas.isNotEmpty()) {
                selecionada = candidatas.random()
                break
            }
        }

        if (selecionada == null) {
            Toast.makeText(this, "Todas as histórias foram usadas.", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        historiaAtual = selecionada
        historiasJaExibidas.add(selecionada.id)

        binding.textDescricao.text = selecionada.descricao
        binding.btnOpcao1.text = selecionada.opcao1
        binding.btnOpcao2.text = selecionada.opcao2
        binding.btnOpcao3.text = selecionada.opcao3

        binding.btnOpcao1.isEnabled = true
        binding.btnOpcao2.isEnabled = true
        binding.btnOpcao3.isEnabled = true

        binding.textFeedback.text = ""
        binding.textFeedback.visibility = android.view.View.GONE
        binding.btnProximo.visibility = android.view.View.GONE
    }

    private fun verificarResposta(opcaoEscolhida: Int) {
        val historia = historiaAtual ?: return

        val correta = historia.respostaCorreta == opcaoEscolhida

        val explicacao = when (opcaoEscolhida) {
            1 -> historia.explicacao1
            2 -> historia.explicacao2
            3 -> historia.explicacao3
            else -> ""
        }

        binding.btnOpcao1.isEnabled = false
        binding.btnOpcao2.isEnabled = false
        binding.btnOpcao3.isEnabled = false

        val corVerde = android.graphics.Color.parseColor("#238636")
        val corVermelha = android.graphics.Color.parseColor("#DA3633")
        val corNormal = android.graphics.Color.parseColor("#161B22")

        binding.btnOpcao1.setBackgroundColor(corNormal)
        binding.btnOpcao2.setBackgroundColor(corNormal)
        binding.btnOpcao3.setBackgroundColor(corNormal)

        when (opcaoEscolhida) {
            1 -> binding.btnOpcao1.setBackgroundColor(if (correta) corVerde else corVermelha)
            2 -> binding.btnOpcao2.setBackgroundColor(if (correta) corVerde else corVermelha)
            3 -> binding.btnOpcao3.setBackgroundColor(if (correta) corVerde else corVermelha)
        }

        val textoFeedback = if (correta) {
            "✅ Acertou!\n\n$explicacao"
        } else {
            "❌ Errou!\n\n$explicacao"
        }

        binding.textFeedback.text = textoFeedback
        binding.textFeedback.setTextColor(if (correta) corVerde else corVermelha)
        binding.textFeedback.visibility = android.view.View.VISIBLE

        binding.btnProximo.isEnabled = true
        binding.btnProximo.visibility = android.view.View.VISIBLE

        totalRespondidas++

        if (correta) {
            acertosSeguidos++
            if (acertosSeguidos >= 2 && dificuldadeAtual < 3) {
                dificuldadeAtual++
                acertosSeguidos = 0
            }
        } else {
            acertosSeguidos = 0
            if (dificuldadeAtual > 1) dificuldadeAtual--
        }

        // Salva no histórico e adiciona XP e verifica conquistas se acertou
        lifecycleScope.launch {
            val db = AppDatabase.getInstance(this@HistoriaActivity)

            // salvar histórico
            db.historicoDao().inserir(
                HistoricoEntity(
                    cenarioId = historia.cenarioId,
                    historiaId = historia.id,
                    acertou = correta,
                    opcaoEscolhida = opcaoEscolhida,
                    timestamp = System.currentTimeMillis()
                )
            )

            // adicionar XP e conquistas se acertou
            if (correta) {
                val usuario = db.usuarioDao().getPrimeiroUsuario()
                val historicoCount = db.historicoDao().contarTodos()

                if (usuario != null) {
                    val xp = when (historia.dificuldadeNivel) {
                        1 -> 5
                        2 -> 10
                        3 -> 15
                        else -> 0
                    }

                    GamificacaoUtils.adicionarXp(
                        context = this@HistoriaActivity,
                        usuarioDao = db.usuarioDao(),
                        conquistaDao = db.conquistaDao(),
                        usuario = usuario,
                        xpGanho = xp,
                        historicoCount = historicoCount
                    )

                    val novoUsuario = db.usuarioDao().getPrimeiroUsuario()
                    if (novoUsuario != null && novoUsuario.nivel > usuario.nivel) {
                        Toast.makeText(
                            this@HistoriaActivity,
                            "🎉 Você subiu para o nível ${novoUsuario.nivel}!",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
        }
    }

}


