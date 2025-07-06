package com.github.mfilipeamorim.mundosocial.ui.cenario

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.github.mfilipeamorim.mundosocial.R
import com.github.mfilipeamorim.mundosocial.adapter.CenarioAdapter
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
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

        // Topo
        findViewById<ImageButton>(R.id.btnVoltar)?.setOnClickListener { finish() }
        findViewById<TextView>(R.id.tituloTopo)?.text = "Selecionar Cenário"

        // Adapter
        adapter = CenarioAdapter { cenario ->
            val intent = android.content.Intent(this, com.github.mfilipeamorim.mundosocial.ui.historia.HistoriaActivity::class.java)
            intent.putExtra("cenarioId", cenario.id)
            startActivity(intent)
        }

        binding.recyclerCenarios.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerCenarios.adapter = adapter

        // Carregar usuário e cenários
        val db = AppDatabase.getInstance(this)
        lifecycleScope.launch {
            val usuario = db.usuarioDao().getPrimeiroUsuario()
            val nivelUsuario = usuario?.nivel ?: 0

            val cenarios = db.cenarioDao().listarTodos()

            adapter.setNivelUsuario(nivelUsuario)
            adapter.submitList(cenarios)
        }
    }
}
