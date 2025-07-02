package com.github.mfilipeamorim.mundosocial.data.seed

import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.model.CenarioEntity
import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object SeedData {

    fun inserirDadosIniciais(db: AppDatabase) {
        CoroutineScope(Dispatchers.IO).launch {
            val cenarioDao = db.cenarioDao()
            val historiaDao = db.historiaDao()

            if (cenarioDao.listarTodos().isNotEmpty()) return@launch

            val cenarios = listOf(
                CenarioEntity(titulo = "Recreio Escolar", nivel = 1),
                CenarioEntity(titulo = "Sala de Aula", nivel = 2),
                CenarioEntity(titulo = "Jogo em Equipe", nivel = 3)
            )

            val cenariosComId = cenarios.map { cenario ->
                val id = cenarioDao.inserir(cenario)
                cenario.copy(id = id)
            }

            cenariosComId.forEach { cenario ->
                val historias = when (cenario.titulo) {
                    "Recreio Escolar" -> listOf(
                        HistoriaEntity(
                            cenarioId = cenario.id,
                            descricao = "Enquanto caminha pelo pátio, você avista um colega sentado sozinho em um canto, olhando para o chão, sem interagir com ninguém ao redor.",
                            opcao1 = "Ignorar pode reforçar o sentimento de exclusão do colega.",
                            opcao2 = "Se aproxima e pergunta se ele quer brincar.",
                            opcao3 = "Faz piada com a situação para os outros rirem",
                            respostaCorreta = 2,
                            explicacao1 = "Ignorar pode fazer o colega se sentir mal.",
                            explicacao2 = "Convidar demonstra empatia e promove a inclusão.",
                            explicacao3 = "Zombar provoca constrangimento e não resolve nada.",
                            dificuldadeNivel = 1
                        ),
                        HistoriaEntity(
                            cenarioId = cenario.id,
                            descricao = "Um colega quer entrar na brincadeira, mas está com dificuldade. O que você faz?",
                            opcao1 = "Ajuda e convida ele para jogar",
                            opcao2 = "Finge que não viu",
                            opcao3 = "Diz que ele está atrapalhando",
                            respostaCorreta = 1,
                            explicacao1 = "Você demonstra inclusão e empatia.",
                            explicacao2 = "Ignorar pode deixar o colega isolado.",
                            explicacao3 = "Rejeitar não ajuda ninguém.",
                            dificuldadeNivel = 2
                        )
                    )

                    "Sala de Aula" -> listOf(
                        HistoriaEntity(
                            cenarioId = cenario.id,
                            descricao = "Você vai apresentar e sente nervoso. O que faz?",
                            opcao1 = "Desiste",
                            opcao2 = "Respira fundo e tenta",
                            opcao3 = "Sai correndo da sala",
                            respostaCorreta = 2,
                            explicacao1 = "Desistir não ajuda você a evoluir.",
                            explicacao2 = "Ótimo! Enfrentar é uma habilidade importante.",
                            explicacao3 = "Fugir não resolve a situação.",
                            dificuldadeNivel = 2
                        ),
                        HistoriaEntity(
                            cenarioId = cenario.id,
                            descricao = "Um colega gagueja durante a apresentação. O que você faz?",
                            opcao1 = "Ri dele",
                            opcao2 = "Incentiva com um sorriso",
                            opcao3 = "Olha para o lado e ignora",
                            respostaCorreta = 2,
                            explicacao1 = "Rir pode envergonhar ainda mais.",
                            explicacao2 = "Incentivar ajuda ele a continuar com confiança.",
                            explicacao3 = "Ignorar não oferece apoio.",
                            dificuldadeNivel = 3
                        )
                    )

                    "Jogo em Equipe" -> listOf(
                        HistoriaEntity(
                            cenarioId = cenario.id,
                            descricao = "Durante o jogo, um colega erra feio. O que você faz?",
                            opcao1 = "Grita com ele",
                            opcao2 = "Diz que está tudo bem e continua",
                            opcao3 = "Pede para ele sair",
                            respostaCorreta = 2,
                            explicacao1 = "Gritar desmotiva e desrespeita.",
                            explicacao2 = "Boa escolha! Incentivar é essencial no time.",
                            explicacao3 = "Excluir alguém não é saudável.",
                            dificuldadeNivel = 3
                        ),
                        HistoriaEntity(
                            cenarioId = cenario.id,
                            descricao = "Você marcou um ponto importante. Como reage?",
                            opcao1 = "Zomba do adversário",
                            opcao2 = "Comemora respeitosamente",
                            opcao3 = "Grita que é melhor que os outros",
                            respostaCorreta = 2,
                            explicacao1 = "Zombar cria conflito e desrespeito.",
                            explicacao2 = "Respeito é essencial mesmo ao vencer.",
                            explicacao3 = "A arrogância pode afastar colegas.",
                            dificuldadeNivel = 2
                        )
                    )

                    else -> emptyList()
                }

                historias.forEach { historiaDao.inserir(it) }
            }
        }
    }
}
