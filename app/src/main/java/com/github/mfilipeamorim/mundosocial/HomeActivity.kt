package com.github.mfilipeamorim.mundosocial

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.github.mfilipeamorim.mundosocial.ui.historico.HistoricoActivity
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.seed.SeedData
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

import com.github.mfilipeamorim.mundosocial.ui.cenario.CenarioActivity
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val tvBemVindo = findViewById<TextView>(R.id.tvBemVindo)


        // Executar acesso ao banco de dados em corrotina
        lifecycleScope.launch {
            val db = AppDatabase.getInstance(this@HomeActivity)

            // Inserir dados iniciais
            SeedData.inserirCenariosIniciais(db)
            SeedData.inserirConquistasIniciais(db)

            // Buscar e exibir nome do usuário
            val usuario = db.usuarioDao().getPrimeiroUsuario()
            usuario?.let {
                tvBemVindo.text = "Bem-vindo, ${it.nome}"
            }
        }

        // Botões
        val btnIniciar = findViewById<MaterialButton>(R.id.btnIniciarCenario)
        val btnHistorico = findViewById<MaterialButton>(R.id.btnHistorico)
        val btnConquistas = findViewById<MaterialButton>(R.id.btnConquistas)

        btnIniciar.setOnClickListener {
            startActivity(Intent(this, CenarioActivity::class.java))
        }

        btnHistorico.setOnClickListener {
            startActivity(Intent(this, HistoricoActivity::class.java))
        }

        btnConquistas.setOnClickListener {
            startActivity(Intent(this, PerfilActivity::class.java))
        }
    }

}