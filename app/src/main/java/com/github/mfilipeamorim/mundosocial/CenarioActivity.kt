package com.github.mfilipeamorim.mundosocial.ui.cenario

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.github.mfilipeamorim.mundosocial.R
import androidx.recyclerview.widget.GridLayoutManager
import com.github.mfilipeamorim.mundosocial.adapter.CenarioAdapter
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.seed.SeedData
import com.github.mfilipeamorim.mundosocial.databinding.ActivityCenarioBinding
import kotlinx.coroutines.launch

class CenarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCenarioBinding
    private lateinit var adapter: CenarioAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityCenarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val botaoVoltar = findViewById<ImageButton>(R.id.btnVoltar)
        val titulo = findViewById<TextView>(R.id.tituloTopo)
        titulo.text = "Selecionar Cenário"
        botaoVoltar.setOnClickListener { finish() }

        adapter = CenarioAdapter { cenario ->
            val intent = android.content.Intent(this, com.github.mfilipeamorim.mundosocial.ui.historia.HistoriaActivity::class.java)
            intent.putExtra("cenarioId", cenario.id)
            startActivity(intent)
        }

        binding.recyclerCenarios.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerCenarios.adapter = adapter

        val db = AppDatabase.getInstance(this)
        lifecycleScope.launch {
            val cenarios = db.cenarioDao().listarTodos()
            adapter.submitList(cenarios)
        }
    }

}
