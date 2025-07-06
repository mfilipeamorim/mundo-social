package com.github.mfilipeamorim.mundosocial.data.seed

import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity

object CenarioIronia {
    fun historias(cenarioId: Long): List<HistoriaEntity> = listOf(
        // 🔸 Nível 1 – Fácil
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega diz 'Que dia lindo!' enquanto todos se molham na chuva. O que ele quis dizer?",
            opcao1 = "Ele está elogiando a beleza da chuva.",
            opcao2 = "Ele está sendo irônico, pois o dia está ruim.",
            opcao3 = "Ele quer sair correndo na chuva.",
            respostaCorreta = 2,
            explicacao1 = "Não há elogio sincero ao clima.",
            explicacao2 = "É uma ironia sobre o tempo ruim.",
            explicacao3 = "Não há sugestão de sair correndo.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Na aula, alguém diz 'Nossa, que legal ter prova surpresa!' Qual o sentido disso?",
            opcao1 = "A pessoa gosta de provas.",
            opcao2 = "A pessoa está sendo sincera.",
            opcao3 = "A pessoa está sendo irônica.",
            respostaCorreta = 3,
            explicacao1 = "Poucos gostam de provas surpresa.",
            explicacao2 = "Não é um elogio real.",
            explicacao3 = "Está usando ironia para criticar.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um amigo chega atrasado e diz 'Cheguei bem na hora!'. O que ele quis dizer?",
            opcao1 = "Está feliz por ter chegado.",
            opcao2 = "Está sendo irônico sobre o atraso.",
            opcao3 = "Está tentando enganar os outros.",
            respostaCorreta = 2,
            explicacao1 = "Não há sinal de alegria real.",
            explicacao2 = "É uma ironia sobre o atraso.",
            explicacao3 = "Não é um plano de engano.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante uma longa fila, alguém comenta: 'Adoro esperar horas!'. O que isso significa?",
            opcao1 = "Essa pessoa é muito paciente.",
            opcao2 = "Está elogiando a fila.",
            opcao3 = "Está reclamando com ironia.",
            respostaCorreta = 3,
            explicacao1 = "Não indica paciência verdadeira.",
            explicacao2 = "Não há elogio real.",
            explicacao3 = "É uma forma irônica de reclamar.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega tropeça e diz 'Uau, que elegante que eu sou!'. Qual o significado?",
            opcao1 = "Ele realmente se sente elegante.",
            opcao2 = "Está usando ironia para rir da situação.",
            opcao3 = "Quer que os outros o imitem.",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio real.",
            explicacao2 = "Ironiza seu tropeço de forma humorada.",
            explicacao3 = "Não há convite à imitação.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém diz 'Que sorte a minha!' após perder o ônibus. O que quer dizer?",
            opcao1 = "Ele realmente se sente com sorte.",
            opcao2 = "Está sendo sarcástico sobre o azar.",
            opcao3 = "Vai tentar pegar outro ônibus.",
            respostaCorreta = 2,
            explicacao1 = "Não é um sentimento verdadeiro.",
            explicacao2 = "É ironia diante do azar.",
            explicacao3 = "A ação não é o foco aqui.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Na hora do recreio acaba a luz e alguém comenta: 'Que bom, agora ficou mais divertido!'.",
            opcao1 = "Ele prefere brincar no escuro.",
            opcao2 = "Está sendo irônico com a situação ruim.",
            opcao3 = "Está chamando os amigos para brincar.",
            respostaCorreta = 2,
            explicacao1 = "Brincar no escuro pode ser perigoso.",
            explicacao2 = "É ironia sobre a falta de luz.",
            explicacao3 = "Não há convite explícito.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Após errar todas as questões, o colega diz 'Nossa, fui muito bem!'. Isso é...",
            opcao1 = "Uma brincadeira irônica.",
            opcao2 = "Um elogio verdadeiro.",
            opcao3 = "Um pedido de ajuda.",
            respostaCorreta = 1,
            explicacao1 = "Está zombando de si mesmo com ironia.",
            explicacao2 = "Não é um elogio real.",
            explicacao3 = "Não há pedido explícito.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega diz 'Adoro quando derrubam meu lanche!'. O que ele quis dizer?",
            opcao1 = "Está realmente feliz com isso.",
            opcao2 = "Está sendo irônico, porque está bravo.",
            opcao3 = "Quer dividir o lanche com alguém.",
            respostaCorreta = 2,
            explicacao1 = "Não é uma alegria verdadeira.",
            explicacao2 = "Expressa raiva de forma irônica.",
            explicacao3 = "Não está oferecendo nada.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém diz 'Ótimo, perdi minha caneta favorita!' com voz irritada. O que ele está expressando?",
            opcao1 = "Tristeza de forma irônica.",
            opcao2 = "Alegria sincera.",
            opcao3 = "Indiferença.",
            respostaCorreta = 1,
            explicacao1 = "Usa ironia para expressar frustração.",
            explicacao2 = "Não está feliz de verdade.",
            explicacao3 = "Não mostra que está neutro.",
            dificuldadeNivel = 1
        ),

        // 🔸 Nível 2 – Médio
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao receber um prêmio que não queria, alguém diz: 'Era tudo o que eu sonhava!'. O que isso indica?",
            opcao1 = "Ele está muito feliz com o prêmio.",
            opcao2 = "Ele está brincando com sinceridade.",
            opcao3 = "Ele está sendo irônico, não gostou do prêmio.",
            respostaCorreta = 3,
            explicacao1 = "Não há sinal de satisfação real.",
            explicacao2 = "Não é uma brincadeira leve.",
            explicacao3 = "Usa ironia para criticar o prêmio.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Após errar uma pergunta fácil, um colega diz: 'Sou um gênio mesmo!'. Qual o sentido dessa fala?",
            opcao1 = "Está ironizando sua própria falha.",
            opcao2 = "Está elogiando sua inteligência.",
            opcao3 = "Está pedindo ajuda.",
            respostaCorreta = 1,
            explicacao1 = "É uma ironia sobre errar algo simples.",
            explicacao2 = "Não está se elogiando de verdade.",
            explicacao3 = "Não há pedido explícito de ajuda.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante uma apresentação desorganizada, alguém comenta: 'Essa foi a melhor apresentação do ano!'.",
            opcao1 = "Está elogiando de verdade.",
            opcao2 = "Está sendo irônico.",
            opcao3 = "Está tentando animar os colegas.",
            respostaCorreta = 2,
            explicacao1 = "A fala contradiz o que aconteceu.",
            explicacao2 = "Expressa ironia sobre o evento ruim.",
            explicacao3 = "Não há sinal de tentativa de ânimo.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao ver um colega bagunçado, outro diz: 'Está pronto para a capa de revista!'. Qual a intenção?",
            opcao1 = "Está zombando da aparência com ironia.",
            opcao2 = "Está convidando para ser modelo.",
            opcao3 = "Está impressionado de verdade.",
            respostaCorreta = 1,
            explicacao1 = "Ironiza a bagunça do colega.",
            explicacao2 = "Não há convite real.",
            explicacao3 = "Não há admiração verdadeira.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Quando alguém é interrompido várias vezes e diz: 'Adoro quando me escutam!'.",
            opcao1 = "Está se sentindo ouvido.",
            opcao2 = "Está sendo sarcástico por não estar sendo ouvido.",
            opcao3 = "Quer mudar de assunto.",
            respostaCorreta = 2,
            explicacao1 = "A fala é oposta à situação.",
            explicacao2 = "Ironiza o fato de ser ignorado.",
            explicacao3 = "Não há sugestão de mudança de assunto.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao receber uma bronca injusta, alguém diz: 'Muito justo, adorei!'. O que isso mostra?",
            opcao1 = "Aceitou bem a bronca.",
            opcao2 = "Está ironizando a injustiça.",
            opcao3 = "Ficou feliz de ser corrigido.",
            respostaCorreta = 2,
            explicacao1 = "Não há aceitação verdadeira.",
            explicacao2 = "Usa ironia para criticar a injustiça.",
            explicacao3 = "Não mostra alegria real.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Depois de esperar muito por ajuda, a pessoa diz: 'Uau, que rapidez!'. O que ela quis dizer?",
            opcao1 = "Está elogiando a agilidade.",
            opcao2 = "Está reclamando com ironia.",
            opcao3 = "Está brincando com os amigos.",
            respostaCorreta = 2,
            explicacao1 = "Não está elogiando de verdade.",
            explicacao2 = "Usa ironia para mostrar frustração.",
            explicacao3 = "Não há tom de brincadeira leve.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Na aula, um colega responde errado e diz: 'Acertei de primeira!'. Isso é...",
            opcao1 = "Uma ironia sobre ter errado.",
            opcao2 = "Um pedido de correção.",
            opcao3 = "Uma confissão sincera.",
            respostaCorreta = 1,
            explicacao1 = "Está ironizando o erro com humor.",
            explicacao2 = "Não é um pedido claro.",
            explicacao3 = "Não é uma confissão real.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao ser escolhido por último no time, um colega comenta: 'Sabia que era o preferido!'. O que significa?",
            opcao1 = "Está feliz com a escolha.",
            opcao2 = "Está sendo irônico sobre ser o último.",
            opcao3 = "Quer desistir do jogo.",
            respostaCorreta = 2,
            explicacao1 = "Não há felicidade genuína.",
            explicacao2 = "Ironiza o fato de ser ignorado.",
            explicacao3 = "Não há desejo de desistir.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante um lanche queimado, alguém diz: 'Melhor comida que já comi!'. Qual o tom dessa frase?",
            opcao1 = "Elogio ao lanche.",
            opcao2 = "Ironia sobre a qualidade ruim.",
            opcao3 = "Fome extrema.",
            respostaCorreta = 2,
            explicacao1 = "Não é um elogio sincero.",
            explicacao2 = "Usa ironia para criticar o lanche.",
            explicacao3 = "Fome não justifica elogio exagerado.",
            dificuldadeNivel = 2
        ),

        // 🔸 Nível 3 – Difícil
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Depois de ouvir alguém explicar algo óbvio, uma pessoa diz: 'Uau, nunca teria pensado nisso sozinho!'.",
            opcao1 = "Está agradecendo de verdade.",
            opcao2 = "Está ironizando por ser algo óbvio.",
            opcao3 = "Está pedindo mais explicações.",
            respostaCorreta = 2,
            explicacao1 = "Não há gratidão genuína.",
            explicacao2 = "Ironiza o excesso de explicação.",
            explicacao3 = "Não pede mais explicações.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante uma atividade mal feita, o professor diz: 'Ficou uma obra de arte!'. Qual o sentido?",
            opcao1 = "Está elogiando o esforço.",
            opcao2 = "Está sendo irônico com a má execução.",
            opcao3 = "Está incentivando a criatividade.",
            respostaCorreta = 2,
            explicacao1 = "Não há elogio verdadeiro.",
            explicacao2 = "Ironiza o resultado ruim.",
            explicacao3 = "Não há foco na criatividade.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao esquecer o dever de casa, o aluno diz: 'Sou muito responsável, né?'. O que ele quis dizer?",
            opcao1 = "Está brincando com seu erro.",
            opcao2 = "Está sendo irônico sobre sua falha.",
            opcao3 = "Quer que o professor o elogie.",
            respostaCorreta = 2,
            explicacao1 = "Não é uma brincadeira leve.",
            explicacao2 = "Ironiza a falta de responsabilidade.",
            explicacao3 = "Não deseja elogio real.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Quando alguém quebra algo e diz: 'Tenho mãos de fada!'. O que isso indica?",
            opcao1 = "Está elogiando suas habilidades.",
            opcao2 = "Está ironizando sua falta de jeito.",
            opcao3 = "Está se comparando a uma fada.",
            respostaCorreta = 2,
            explicacao1 = "Não é uma autoavaliação positiva.",
            explicacao2 = "Ironiza sua falta de cuidado.",
            explicacao3 = "Não há comparação real com fadas.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante uma discussão, alguém diz: 'Que ótimo conversar assim!'. Qual o tom?",
            opcao1 = "Está sendo irônico com a briga.",
            opcao2 = "Está feliz com o diálogo.",
            opcao3 = "Quer encerrar a conversa.",
            respostaCorreta = 1,
            explicacao1 = "Ironiza o conflito.",
            explicacao2 = "Não há sinal de alegria.",
            explicacao3 = "Não há proposta de encerramento.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Quando um colega derruba tudo, outro diz: 'Você é pura delicadeza!'.",
            opcao1 = "Está elogiando a leveza do colega.",
            opcao2 = "Está sendo irônico com a bagunça.",
            opcao3 = "Está tentando consolar.",
            respostaCorreta = 2,
            explicacao1 = "Não há elogio real.",
            explicacao2 = "Ironiza o comportamento desastrado.",
            explicacao3 = "Não há tom de consolo.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Após alguém ignorar a fila, outro comenta: 'Que exemplo de educação!'. O que isso quer dizer?",
            opcao1 = "Está elogiando a educação da pessoa.",
            opcao2 = "Está criticando com ironia.",
            opcao3 = "Está incentivando o comportamento.",
            respostaCorreta = 2,
            explicacao1 = "Não há elogio verdadeiro.",
            explicacao2 = "Critica o comportamento com ironia.",
            explicacao3 = "Não é um incentivo real.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Quando um amigo atrasa uma hora, você diz: 'Você é sempre tão pontual!'. Isso é...",
            opcao1 = "Ironia sobre o atraso.",
            opcao2 = "Elogio sincero.",
            opcao3 = "Pedido de desculpa.",
            respostaCorreta = 1,
            explicacao1 = "Zomba do atraso com ironia.",
            explicacao2 = "Não é elogio verdadeiro.",
            explicacao3 = "Não está se desculpando.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Depois de fazer uma bagunça, alguém diz: 'Sou muito organizado!'.",
            opcao1 = "Está se descrevendo de verdade.",
            opcao2 = "Está criticando a si mesmo com ironia.",
            opcao3 = "Está dando uma desculpa.",
            respostaCorreta = 2,
            explicacao1 = "A ação mostra o contrário.",
            explicacao2 = "Ironiza a própria desorganização.",
            explicacao3 = "Não há desculpa clara.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao ouvir uma piada sem graça, alguém diz: 'Nossa, quase morri de rir!'. Isso demonstra...",
            opcao1 = "Alegria exagerada.",
            opcao2 = "Ironia sobre a piada sem graça.",
            opcao3 = "Satisfação verdadeira.",
            respostaCorreta = 2,
            explicacao1 = "Não há emoção real.",
            explicacao2 = "Critica a piada usando ironia.",
            explicacao3 = "Não demonstra satisfação genuína.",
            dificuldadeNivel = 3
        )
    )
}



