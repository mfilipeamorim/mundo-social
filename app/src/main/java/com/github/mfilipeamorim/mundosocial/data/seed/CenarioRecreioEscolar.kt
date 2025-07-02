package com.github.mfilipeamorim.mundosocial.data.seed

import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity

object CenarioRecreioEscolar {
    fun historias(cenarioId: Long): List<HistoriaEntity> = listOf(
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você vê um colega sozinho no recreio. O que faz?",
            opcao1 = "Ignora",
            opcao2 = "Convida para brincar",
            opcao3 = "Zomba dele",
            respostaCorreta = 2,
            explicacao1 = "Ignorar pode fazer o colega se sentir mal.",
            explicacao2 = "Isso mostra empatia e inclusão.",
            explicacao3 = "Zombar machuca e não resolve.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
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
}
