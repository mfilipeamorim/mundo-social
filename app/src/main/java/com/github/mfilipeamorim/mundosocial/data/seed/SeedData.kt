package com.github.mfilipeamorim.mundosocial.data.seed

import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.model.CenarioEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object SeedData {

    fun inserirCenariosIniciais(db: AppDatabase) {
        CoroutineScope(Dispatchers.IO).launch {
            val cenarioDao = db.cenarioDao()
            val historiaDao = db.historiaDao()

            if (cenarioDao.listarTodos().isNotEmpty()) return@launch

            val cenarios = listOf(
                CenarioEntity(titulo = "Indiretas", nivel = 1),
                CenarioEntity(titulo = "Metáforas", nivel = 2),
                CenarioEntity(titulo = "Irônias", nivel = 3)
                // TODO: Adicionar cenários conforme Nivel
            )

            val cenariosComId = cenarios.map { cenario ->
                val id = cenarioDao.inserir(cenario)
                cenario.copy(id = id)
            }


            for (cenario in cenariosComId) {
                val historias = when (cenario.titulo) {
                    "Indiretas" -> CenarioIndiretas.historias(cenario.id)
                    "Metáforas" -> CenarioMetaforas.historias(cenario.id)
                    "Irônias" -> CenarioIronia.historias(cenario.id)
                    // TODO: Adicionar cenários novos
                    else -> emptyList()
                }

                historias.forEach { historiaDao.inserir(it) }
            }
        }
    }

}
