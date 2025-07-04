package com.github.mfilipeamorim.mundosocial

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.github.mfilipeamorim.mundosocial.ui.historico.HistoricoActivity
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.seed.SeedData
import com.github.mfilipeamorim.mundosocial.ui.cenario.CenarioActivity
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        SeedData.inserirCenariosIniciais(AppDatabase.getInstance(this))

        val btnIniciar = findViewById<MaterialButton>(R.id.btnIniciarCenario)
        val btnHistorico = findViewById<MaterialButton>(R.id.btnHistorico)
        val btnConquistas = findViewById<MaterialButton>(R.id.btnConquistas)

        btnIniciar.setOnClickListener {
            val intent = Intent(this, CenarioActivity::class.java)
            startActivity(intent)
        }


        btnHistorico.setOnClickListener {
            val intent = Intent(this, HistoricoActivity::class.java)
            startActivity(intent)
        }

        btnConquistas.setOnClickListener {
            // TODO: abrir tela de conquistas
        }
    }
}