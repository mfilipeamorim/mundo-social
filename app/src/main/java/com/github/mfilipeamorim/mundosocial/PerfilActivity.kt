package com.github.mfilipeamorim.mundosocial

import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perfil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔝 Topo reutilizável
        findViewById<ImageButton>(R.id.btnVoltar)?.setOnClickListener {
            finish()
        }

        findViewById<TextView>(R.id.tituloTopo)?.text = "Meu Perfil"

        // Referências dos elementos do perfil
        val tvNome = findViewById<TextView>(R.id.tvNome)
        val tvIdade = findViewById<TextView>(R.id.tvIdade)
        val tvNivel = findViewById<TextView>(R.id.tvNivel)
        val tvXp = findViewById<TextView>(R.id.tvXp)
        val progressXp = findViewById<ProgressBar>(R.id.progressXp)
        val layoutConquistas = findViewById<LinearLayout>(R.id.layoutConquistas)

        val db = AppDatabase.getInstance(this)
        val usuarioDao = db.usuarioDao()
        val conquistaDao = db.conquistaDao()

        lifecycleScope.launch {
            val usuario = withContext(Dispatchers.IO) {
                usuarioDao.getPrimeiroUsuario()
            }

            if (usuario != null) {
                tvNome.text = "${usuario.nome}"
                tvIdade.text = "${usuario.idade} anos"
                tvNivel.text = "Nível: ${usuario.nivel}"
                tvXp.text = "XP: ${usuario.xp} / 100"
                progressXp.progress = usuario.xp
            } else {
                tvNome.text = "Nome: não encontrado"
                tvIdade.text = "Idade: não encontrada"
                tvNivel.text = "Nível: -"
                tvXp.text = "XP: -"
                progressXp.progress = 0
            }

            // Carregar conquistas desbloqueadas
            val conquistasDesbloqueadas = withContext(Dispatchers.IO) {
                conquistaDao.listarDesbloqueadas()
            }

            layoutConquistas.removeAllViews()

            for (conquista in conquistasDesbloqueadas) {
                val itemView = layoutInflater.inflate(R.layout.item_conquista, layoutConquistas, false)

                val tvTitulo = itemView.findViewById<TextView>(R.id.tvTituloConquista)
                val tvDescricao = itemView.findViewById<TextView>(R.id.tvDescricaoConquista)
                val img = itemView.findViewById<ImageView>(R.id.imgConquista)

                tvTitulo.text = conquista.titulo
                tvDescricao.text = conquista.descricao

                val nomeDrawable = conquista.iconeRes.trim().lowercase().replace(" ", "_").replace(".png", "")
                val drawableId = resources.getIdentifier(nomeDrawable, "drawable", packageName)

                if (drawableId != 0) {
                    img.setImageResource(drawableId)
                } else {
                    Log.e("Conquista", "Drawable não encontrado: '$nomeDrawable'. Usando ícone padrão.")
                    img.setImageResource(R.drawable.ic_conquista_padrao)
                }

                layoutConquistas.addView(itemView)
            }
        }
    }
}
