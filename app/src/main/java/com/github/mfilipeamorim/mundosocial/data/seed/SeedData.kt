package com.github.mfilipeamorim.mundosocial.data.seed

import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.model.CenarioEntity
import com.github.mfilipeamorim.mundosocial.data.model.ConquistaEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object SeedData {

    fun inserirCenariosIniciais(db: AppDatabase) {
        CoroutineScope(Dispatchers.IO).launch {
            val cenarioDao = db.cenarioDao()
            val historiaDao = db.historiaDao()

            if (cenarioDao.listarTodos().isNotEmpty()) return@launch

            val cenarios = listOf(
                CenarioEntity(titulo = "Metáforas", nivel = 1),
                CenarioEntity(titulo = "Indiretas", nivel = 2),
                CenarioEntity(titulo = "Irônias", nivel = 3)
                // TODO: Adicionar cenários conforme Nivel
            )

            val cenariosComId = cenarios.map { cenario ->
                val id = cenarioDao.inserir(cenario)
                cenario.copy(id = id)
            }


            for (cenario in cenariosComId) {
                val historias = when (cenario.titulo) {
                    "Metáforas" -> CenarioMetaforas.historias(cenario.id)
                    "Indiretas" -> CenarioIndiretas.historias(cenario.id)
                    "Irônias" -> CenarioIronia.historias(cenario.id)
                    // TODO: Adicionar cenários novos
                    else -> emptyList()
                }

                historias.forEach { historiaDao.inserir(it) }
            }
        }
    }

    suspend fun inserirConquistasIniciais(db: AppDatabase) = withContext(Dispatchers.IO) {
        val conquistaDao = db.conquistaDao()
        val jaExiste = conquistaDao.listarTodas().isNotEmpty()
        if (jaExiste) return@withContext

        val conquistas = listOf(
            ConquistaEntity(titulo = "Primeiro Acerto!",
                            descricao = "Primeira resposta respondida corretamente.",
                            iconeRes = "ic_conquista_resposta"),
            ConquistaEntity(titulo = "Pequeno Sociológo",
                            descricao = "Conseguiu alcançar o nível 3",
                            iconeRes = "ic_medalha")
        )

        conquistas.forEach {
            conquistaDao.inserir(it)
        }
    }

}
