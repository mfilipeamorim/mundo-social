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

            if (cenarioDao.listarTodos().isNotEmpty()) return@launch

            val cenarios = listOf(
                CenarioEntity(titulo = "Recreio Escolar", nivel = 1),
                CenarioEntity(titulo = "Sala de Aula", nivel = 2),
                CenarioEntity(titulo = "Jogo em Equipe", nivel = 3)
            )

            cenarios.forEach { cenarioDao.inserir(it) }
        }
    }
}
