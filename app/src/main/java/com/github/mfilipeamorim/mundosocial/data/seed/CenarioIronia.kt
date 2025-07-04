package com.github.mfilipeamorim.mundosocial.data.seed

import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity

object CenarioIronia {
    fun historias(cenarioId: Long): List<HistoriaEntity> = listOf(
        // 10 Fáceis (nível 1)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante o recreio um colega diz “Que clima agradável” em um dia chuvoso e frio. O que ele quer dizer?",
            opcao1 = "Que realmente está caloroso e ensolarado",
            opcao2 = "Que o tempo está desagradável e frio",
            opcao3 = "Que vai mudar o clima com forças sobrenaturais",
            respostaCorreta = 2,
            explicacao1 = "Interpretação literal não corresponde ao clima real.",
            explicacao2 = "É uma forma irônica de comentar o frio e chuva.",
            explicacao3 = "Não há referência a poderes mágicos.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um amigo ironiza dizendo “Que ótimo horário” ao ver o sinal fechar justo quando você chega. Qual o sentido?",
            opcao1 = "Elogio sincero ao momento perfeito",
            opcao2 = "Crítica ao atraso e sinal inoportuno",
            opcao3 = "Convite para voltarem depois",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio real ao horário.",
            explicacao2 = "Ironiza o fato de ter perdido o sinal.",
            explicacao3 = "Não há sugestão de voltarem depois.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Parabéns, você sempre acerta” após alguém errar feio no jogo. O que isso implica?",
            opcao1 = "Elogio à habilidade consistente",
            opcao2 = "Zombaria pelo erro evidente",
            opcao3 = "Pergunta sobre método de acerto",
            respostaCorreta = 2,
            explicacao1 = "Contexto de erro mostra ironia.",
            explicacao2 = "É sarcasmo para brincar com a falha.",
            explicacao3 = "Não há questionamento de método.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega diz “Adoro quando tá tudo bagunçado” ao ver brinquedos espalhados. Qual a implicação?",
            opcao1 = "Elogio à organização caótica",
            opcao2 = "Reclamação irônica sobre a bagunça",
            opcao3 = "Sugestão de guardar os brinquedos",
            respostaCorreta = 2,
            explicacao1 = "Não há real apreço pela desordem.",
            explicacao2 = "Ironiza situação confusa.",
            explicacao3 = "Não há sugestão direta de ação.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Que silêncio ensurdecedor” em sala cheia de conversa. O que ele quis dizer?",
            opcao1 = "Elogio ao sossego absoluto",
            opcao2 = "Comentário irônico sobre barulho intenso",
            opcao3 = "Pedido para ficarem quietos",
            respostaCorreta = 2,
            explicacao1 = "Silêncio absoluto não corresponde ao cenário.",
            explicacao2 = "É ironia para destacar o barulho.",
            explicacao3 = "Não é um comando direto.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "No recreio alguém fala “Que ótimo método de estudo” após cola ser descoberta. Qual o sentido?",
            opcao1 = "Elogio ao método eficiente",
            opcao2 = "Crítica irônica à cola irregular",
            opcao3 = "Pergunta sobre material de estudo",
            respostaCorreta = 2,
            explicacao1 = "Cola descoberta mostra ineficácia.",
            explicacao2 = "Ironiza tentativa de trapaça.",
            explicacao3 = "Não busca recurso didático.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um amigo solta “Que ideia brilhante” quando alguém propõe limpar o recreio sozinho em pouco tempo. O que isso indica?",
            opcao1 = "Elogio genuíno à criatividade",
            opcao2 = "Sarcasmo sobre propostas irreais",
            opcao3 = "Convite para ajudar na limpeza",
            respostaCorreta = 2,
            explicacao1 = "Tarefa impossível invalida elogio.",
            explicacao2 = "Ironiza ambição exagerada.",
            explicacao3 = "Não há convite real.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Que sensacional” quando alguém derruba tudo sem querer. O que se quer dizer?",
            opcao1 = "Elogio à habilidade extraordinária",
            opcao2 = "Comentário sarcástico sobre desastre",
            opcao3 = "Elogio à limpeza rápida",
            respostaCorreta = 2,
            explicacao1 = "Não há habilidade na derrubada.",
            explicacao2 = "Ironiza confusão criada.",
            explicacao3 = "Não relaciona limpeza.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante uma brincadeira, alguém fala “Mandou bem” após um erro. Qual o sentido?",
            opcao1 = "Elogio à performance acertada",
            opcao2 = "Ironia zombeteira sobre falha",
            opcao3 = "Pergunta sobre técnicas usadas",
            respostaCorreta = 2,
            explicacao1 = "Erro mostra falta de êxito.",
            explicacao2 = "É sarcasmo diante do insucesso.",
            explicacao3 = "Não busca aprimoramento.",
            dificuldadeNivel = 1
        ),

        // 10 Médias (nível 2)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Parabéns, campeão” quando alguém tropeça nos brinquedos. Qual a ironia?",
            opcao1 = "Reconhecimento genuíno de vitória",
            opcao2 = "Zombaria sobre a queda inesperada",
            opcao3 = "Convite para competirem novamente",
            respostaCorreta = 2,
            explicacao1 = "Cair não indica vitória.",
            explicacao2 = "Ironiza tropeço como falha.",
            explicacao3 = "Não há proposta de nova disputa.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Após um colega perder a vez na fila, alguém diz “Boa estratégia” de forma irônica. O que isso quer dizer?",
            opcao1 = "Elogio à escolha planejada",
            opcao2 = "Crítica irônica à má decisão",
            opcao3 = "Pergunta sobre estratégia futura",
            respostaCorreta = 2,
            explicacao1 = "Perder vez não é estratégia boa.",
            explicacao2 = "Ironiza decisão errada.",
            explicacao3 = "Não sugere plano novo.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Ótimo senso de humor” após alguém contar piada sem graça. Qual a indireta?",
            opcao1 = "Elogio sincero ao humor",
            opcao2 = "Sarcasmo sobre a piada ruim",
            opcao3 = "Convite para fazer mais piadas",
            respostaCorreta = 2,
            explicacao1 = "Contexto não apoia elogio.",
            explicacao2 = "Ironiza qualidade ruim.",
            explicacao3 = "Não há convite genuíno.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante um grupo, alguém diz “Que ótima coordenação” quando todos trombam uns nos outros. Qual a implicação?",
            opcao1 = "Elogio ao trabalho em equipe",
            opcao2 = "Comentário irônico sobre falta de coordenação",
            opcao3 = "Pergunta sobre exercícios de coordenação",
            respostaCorreta = 2,
            explicacao1 = "Trombar demonstra descoordenação.",
            explicacao2 = "Ironiza cena desorganizada.",
            explicacao3 = "Não há convite para treinar.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Que comida deliciosa” ao ver o lanche vagabundo de um amigo. Qual o tom?",
            opcao1 = "Elogio à qualidade real",
            opcao2 = "Sarcasmo sobre aspecto ruim",
            opcao3 = "Convite para comida de verdade",
            respostaCorreta = 2,
            explicacao1 = "Lanche ruim não é delicioso.",
            explicacao2 = "Ironiza aspecto insatisfatório.",
            explicacao3 = "Não há oferta de comida.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Quando alguém diz “Siga em frente, mestre” ao ver seu erro, qual a ironia?",
            opcao1 = "Elogio ao domínio da tarefa",
            opcao2 = "Zombaria pela falha evidente",
            opcao3 = "Pedido para ensinarem técnica",
            respostaCorreta = 2,
            explicacao1 = "Erro indica falta de maestria.",
            explicacao2 = "É sarcasmo respeitoso para criticar.",
            explicacao3 = "Não há pedido de ensinamento.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Que planejamento exemplar” quando a atividade trava tudo. Qual o sentido?",
            opcao1 = "Elogio à organização eficiente",
            opcao2 = "Comentário irônico sobre falha de plano",
            opcao3 = "Sugestão de novo cronograma",
            respostaCorreta = 2,
            explicacao1 = "Plano falho não é exemplar.",
            explicacao2 = "Ironiza resultado ruim.",
            explicacao3 = "Não há sugestão prática.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém comenta “Excelente gerenciamento de tempo” em tarefa atrasada. O que implica?",
            opcao1 = "Elogio genuíno à pontualidade",
            opcao2 = "Sarcasmo sobre atraso evidente",
            opcao3 = "Pergunta sobre técnicas de gestão",
            respostaCorreta = 2,
            explicacao1 = "Atraso não justifica elogio.",
            explicacao2 = "Ironiza falta de tempo.",
            explicacao3 = "Não busca aprendizado.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Você é muito prático” quando alguém resolve problema simples de modo óbvio. Qual a ironia?",
            opcao1 = "Elogio à eficiência prática",
            opcao2 = "Comentário sarcástico sobre obviedade",
            opcao3 = "Sugestão para métodos complexos",
            respostaCorreta = 2,
            explicacao1 = "Solução óbvia não é mérito excepcional.",
            explicacao2 = "Ironiza falta de originalidade.",
            explicacao3 = "Não há proposta de complexidade.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega solta “Nossa, que grande ajuda” depois de ajuda mínima. Qual a ironia?",
            opcao1 = "Agradecimento sincero",
            opcao2 = "Sarcasmo sobre contribuição ínfima",
            opcao3 = "Pedido para ajuda maior",
            respostaCorreta = 2,
            explicacao1 = "Ajuda mínima não justifica elogio.",
            explicacao2 = "Ironiza esforço insignificante.",
            explicacao3 = "Não há solicitação adicional.",
            dificuldadeNivel = 2
        ),

        // 10 Difíceis (nível 3)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Que performance majestosa” quando alguém tropeça publicamente. Qual a ironia elaborada?",
            opcao1 = "Elogio sincero à performance",
            opcao2 = "Sarcasmo requintado sobre falha visível",
            opcao3 = "Pergunta sobre técnicas de palco",
            respostaCorreta = 2,
            explicacao1 = "Tropeçar não é performance excelente.",
            explicacao2 = "É crítica sofisticada disfarçada de elogio.",
            explicacao3 = "Não há curiosidade técnica.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao ouvir “Que visão de futuro” sobre ideia impossívável, qual a ironia sutil?",
            opcao1 = "Elogio à foresight genuína",
            opcao2 = "Zombaria refinada sobre pragmatização impossível",
            opcao3 = "Convite para planejamento detalhado",
            respostaCorreta = 2,
            explicacao1 = "Ideia impossível não reflete visão real.",
            explicacao2 = "Ironiza falta de praticidade.",
            explicacao3 = "Não sugere elaboração.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Quem diria” ao ver resultado previsível. Qual a ironia madura?",
            opcao1 = "Surpresa legítima",
            opcao2 = "Sarcasmo discreto sobre previsão óbvia",
            opcao3 = "Pergunta sobre quem diria",
            respostaCorreta = 2,
            explicacao1 = "Resultado já era esperado.",
            explicacao2 = "Expressa tédio com previsibilidade.",
            explicacao3 = "Não há busca por nomes.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Num debate alguém diz “Que argumento esclarecedor” após comentário vago. Qual a ironia erudita?",
            opcao1 = "Elogio à clareza intelectual",
            opcao2 = "Ironia acadêmica sobre vagueza",
            opcao3 = "Pedido de mais detalhes técnicos",
            respostaCorreta = 2,
            explicacao1 = "Comentário vago não esclarece nada.",
            explicacao2 = "Critica a falta de substância.",
            explicacao3 = "Não há real curiosidade." ,
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém afirma “Que incrível profissionalismo” quando colegas atrasam. Qual a ironia trabalhista?",
            opcao1 = "Elogio sincero ao comprometimento",
            opcao2 = "Sarcasmo refinado sobre falta de pontualidade",
            opcao3 = "Sugestão de treinamentos",
            respostaCorreta = 2,
            explicacao1 = "Atraso não indica profissionalismo.",
            explicacao2 = "Ironiza comportamento inadequado.",
            explicacao3 = "Não há oferta de treinamento.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Que paciência de Jó” quando alguém só espera em silêncio. Qual a ironia bíblica?",
            opcao1 = "Elogio à tolerância excepcional",
            opcao2 = "Comentário sarcástico sobre espera passiva",
            opcao3 = "Pergunta sobre paciência real",
            respostaCorreta = 2,
            explicacao1 = "Espera passiva não é virtude exaltada.",
            explicacao2 = "Ironiza comportamento resignado.",
            explicacao3 = "Não há busca de informações bíblicas.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante a fila, ouve-se “Que gentileza extrema” para quem empurra. Qual a ironia social?",
            opcao1 = "Elogio ao comportamento respeitoso",
            opcao2 = "Zombaria sobre grosseria evidente",
            opcao3 = "Pedido de licença formal",
            respostaCorreta = 2,
            explicacao1 = "Empurrar não é ato gentil.",
            explicacao2 = "Ironiza falta de educação.",
            explicacao3 = "Não há convite educado.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Que coincidência incrível” quando algo previsível acontece. Qual a ironia temporal?",
            opcao1 = "Surpresa genuína pela aleatoriedade",
            opcao2 = "Comentário sarcástico sobre previsibilidade",
            opcao3 = "Pergunta sobre coincidências anteriores",
            respostaCorreta = 2,
            explicacao1 = "Evento previsível não surpreende.",
            explicacao2 = "Destaca falta de novidade.",
            explicacao3 = "Não há interesse histórico.",
            dificuldadeNivel = 3
        )
    )
}
