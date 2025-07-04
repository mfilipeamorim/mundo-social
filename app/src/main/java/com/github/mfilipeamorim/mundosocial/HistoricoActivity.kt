package com.github.mfilipeamorim.mundosocial.ui.historico

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.mfilipeamorim.mundosocial.adapter.HistoricoAdapter
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.R
import com.github.mfilipeamorim.mundosocial.databinding.ActivityHistoricoBinding
import kotlinx.coroutines.launch

class HistoricoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHistoricoBinding
    private lateinit var adapter: HistoricoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHistoricoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Topo
        findViewById<ImageButton>(R.id.btnVoltar)?.setOnClickListener { finish() }
        findViewById<TextView>(R.id.tituloTopo)?.text = "Histórico"



        val db = AppDatabase.getInstance(this)
        val adapter = HistoricoAdapter(db)

        binding.recyclerHistorico.layoutManager = LinearLayoutManager(this)
        binding.recyclerHistorico.adapter = adapter



        binding.chipAcertos.setOnClickListener {
            lifecycleScope.launch {
                adapter.submitList(db.historicoDao().listarAcertos())
            }
        }

        binding.chipErros.setOnClickListener {
            lifecycleScope.launch {
                adapter.submitList(db.historicoDao().listarErros())
            }
        }

        binding.chipTodos.setOnClickListener {
            lifecycleScope.launch {
                adapter.submitList(db.historicoDao().listarTodos())
            }
        }


        // Carrega todos inicialmente
        lifecycleScope.launch {
            adapter.submitList(db.historicoDao().listarTodos())
        }
    }
}
