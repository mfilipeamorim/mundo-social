package com.github.mfilipeamorim.mundosocial.data.seed

import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity

object CenarioIndiretas {
    fun historias(cenarioId: Long): List<HistoriaEntity> = listOf(
        // 10 Fáceis (nível 1)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve um colega dizer “Que carroceiro elegante!” quando alguém entra na sala bem arrumado. Qual a intenção?",
            opcao1 = "Elogiar o estilo com humor",
            opcao2 = "Chamar de carroceiro de forma pejorativa",
            opcao3 = "Perguntar sobre carruagens antigas",
            respostaCorreta = 1,
            explicacao1 = "É um elogio brincalhão ao visual bem vestido.",
            explicacao2 = "Não há intenção de insultar no tom usado.",
            explicacao3 = "Não se trata de história de carruagens.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém comenta “Nossa, você comeu bem hoje, hein?” para um amigo que sempre pula o café da manhã. Qual o real significado?",
            opcao1 = "Elogiar o apetite saudável",
            opcao2 = "Fazer indireta sobre fome anterior",
            opcao3 = "Oferecer comida para o amigo",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio sobre saudabilidade.",
            explicacao2 = "Reflete preocupação sobre hábito de não comer.",
            explicacao3 = "Não há oferta real de comida.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Adorei o silêncio hoje” quando a aula não tem perguntas. O que isso realmente sugere?",
            opcao1 = "Elogio à atenção em sala",
            opcao2 = "Reclamação de tédio e falta de participação",
            opcao3 = "Convite para conversar",
            respostaCorreta = 2,
            explicacao1 = "Não é só elogio à disciplina.",
            explicacao2 = "Indica que o silêncio tornou a aula entediante.",
            explicacao3 = "Não há intenção de diálogo.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um amigo diz “Você sempre chega cedo, impressionante” após você chegar um minuto antes. Qual a indireta?",
            opcao1 = "Reconhecimento sincero da pontualidade",
            opcao2 = "Brincadeira sobre raridade de chegar cedo",
            opcao3 = "Convite para chegar ainda mais cedo",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio puro, mas tom de surpresa.",
            explicacao2 = "Sinaliza que não era esperado você tão pontual.",
            explicacao3 = "Não há proposta de mudar horário.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Nossa, que silêncio constrangedor” depois de uma pergunta sem respostas. O que se quer dizer?",
            opcao1 = "Apreciar o ambiente calmo",
            opcao2 = "Criticar a falta de resposta dos colegas",
            opcao3 = "Elogiar o professor",
            respostaCorreta = 2,
            explicacao1 = "Não é apreciação de tranquilidade.",
            explicacao2 = "É crítica ao fato de ninguém responder.",
            explicacao3 = "Não menciona o professor.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega diz “Que ideia original” após você sugerir algo óbvio. Qual o sentido disso?",
            opcao1 = "Elogio genuíno à sua criatividade",
            opcao2 = "Sarcasmo apontando falta de novidade",
            opcao3 = "Convite para desenvolver mais a ideia",
            respostaCorreta = 2,
            explicacao1 = "Não há real entusiasmo pelo óbvio.",
            explicacao2 = "Expressa desaprovação disfarçada de elogio.",
            explicacao3 = "Não há incentivo a expandir.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Tá muito esperto hoje” quando alguém acerta algo fácil. Qual a indireta?",
            opcao1 = "Elogiar inteligência habitual",
            opcao2 = "Brincadeira sobre ter acertado algo simples",
            opcao3 = "Convite para resolver algo mais difícil",
            respostaCorreta = 2,
            explicacao1 = "Não implica inteligência acima do normal.",
            explicacao2 = "Indica surpresa por algo fácil ter saído bem.",
            explicacao3 = "Não envolve convite.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao ouvir “Que ótimo trabalho de equipe”, mas em tom seco, o que está implícito?",
            opcao1 = "Elogio entusiasmado",
            opcao2 = "Ironia questionando a qualidade do trabalho",
            opcao3 = "Pergunta sobre divisão de tarefas",
            respostaCorreta = 2,
            explicacao1 = "Tom seco revela falta de entusiasmo sincero.",
            explicacao2 = "Ironia questiona a eficácia da equipe.",
            explicacao3 = "Não há interesse em detalhes de tarefas.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um amigo solta “Você sempre me entende tão bem” após um erro óbvio. Qual a indireta?",
            opcao1 = "Elogio genuíno de compreensão",
            opcao2 = "Sarcasmo sobre não ter entendido nada",
            opcao3 = "Convite para explicar melhor",
            respostaCorreta = 2,
            explicacao1 = "Não é reconhecimento sincero.",
            explicacao2 = "Indica crítica à falta de compreensão.",
            explicacao3 = "Não busca esclarecimento.",
            dificuldadeNivel = 1
        ),

        // 10 Médias (nível 2)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Adoro quando a gente começa cedo” de um colega que sempre se atrasa. Qual a indireta?",
            opcao1 = "Satisfação sincera pela pontualidade",
            opcao2 = "Sarcasmo ressaltando o atraso dele",
            opcao3 = "Sugestão para começarem ainda mais cedo outro dia",
            respostaCorreta = 2,
            explicacao1 = "Tom e contexto mostram crítica ao atraso.",
            explicacao2 = "Expressa ironia sobre ele ter chegado tarde.",
            explicacao3 = "Não há proposta de mudança futura.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega comenta “Que inventividade a nossa” depois de copiar sua resposta. Qual o significado real?",
            opcao1 = "Elogio à criatividade compartilhada",
            opcao2 = "Indireta de que ele copiou seu trabalho",
            opcao3 = "Sugestão para inventarem outra coisa",
            respostaCorreta = 2,
            explicacao1 = "Não elogia trabalho conjunto.",
            explicacao2 = "Denota insatisfação por ter sido copiado.",
            explicacao3 = "Não há convite a nova criação.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Gosto do seu senso de humor” após contar uma piada sem graça. Qual a indireta?",
            opcao1 = "Elogio sincero ao humor",
            opcao2 = "Sarcasmo sobre a piada ruim",
            opcao3 = "Convite para fazer mais piadas",
            respostaCorreta = 2,
            explicacao1 = "Contexto revela tom de deboche.",
            explicacao2 = "É crítica sutil à qualidade da piada.",
            explicacao3 = "Não há incentivo a continuar.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Nossa, você fala tanto…” após um colega falar demais sobre algo óbvio. Qual a indireta?",
            opcao1 = "Elogio à sua eloquência",
            opcao2 = "Reclamação de que fala em excesso",
            opcao3 = "Incentivo para continuar falando",
            respostaCorreta = 2,
            explicacao1 = "Não reconhece eloquência, é crítica.",
            explicacao2 = "Expressa incômodo com verborragia.",
            explicacao3 = "Não há encorajamento.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém diz “Você é tão organizado” ao ver sua mochila bagunçada. Qual a indireta?",
            opcao1 = "Elogio honesto sobre organização",
            opcao2 = "Brincadeira zombeteira sobre bagunça",
            opcao3 = "Dúvida séria sobre arrumação",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio, mas piada sobre desordem.",
            explicacao2 = "Expressa ironia sobre o estado real.",
            explicacao3 = "Não questiona com seriedade.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Parece que alguém acordou animado” para quem está visivelmente cansado. Qual a indireta?",
            opcao1 = "Elogio à animação matinal",
            opcao2 = "Ironia apontando cansaço evidente",
            opcao3 = "Convite para animar o dia",
            respostaCorreta = 2,
            explicacao1 = "Não elogia animação real.",
            explicacao2 = "Destaca contradição entre fala e aparência.",
            explicacao3 = "Não há convite genuíno.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega diz “Que visão apurada” ao ver sua resposta errada. Qual o real sentido?",
            opcao1 = "Elogio ao poder de observação",
            opcao2 = "Sarcasmo sobre equívoco cometido",
            opcao3 = "Pergunta sobre técnicas de observação",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio, mas crítica disfarçada.",
            explicacao2 = "Expressa deboche sobre erro.",
            explicacao3 = "Não busca explicação técnica.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Obrigado pela ajuda” de quem não fez esforço algum. Qual a indireta?",
            opcao1 = "Agradecimento sincero",
            opcao2 = "Sarcasmo por falta de esforço",
            opcao3 = "Convite para ajudar mais",
            respostaCorreta = 2,
            explicacao1 = "Não é sincero, tom sugere ironia.",
            explicacao2 = "Reflete insatisfação com falta de empenho.",
            explicacao3 = "Não há convite real.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém comenta “Que ótimo senso de oportunidade” quando você pergunta algo muito tarde. Qual a indireta?",
            opcao1 = "Elogio pela escolha do momento",
            opcao2 = "Ironia sobre o timing inoportuno",
            opcao3 = "Sugestão de melhorar planejamento",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio genuíno.",
            explicacao2 = "Destaca mau momento da pergunta.",
            explicacao3 = "Não sugere planejamento.",
            dificuldadeNivel = 2
        ),

        // 10 Difíceis (nível 3)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Que surpresa agradável” quando um aluno atrasado finalmente chega. Qual a indireta sofisticada?",
            opcao1 = "Elogio à pontualidade",
            opcao2 = "Sarcasmo refinado sobre atraso habitual",
            opcao3 = "Pergunta sobre motivos do atraso",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio à pontualidade.",
            explicacao2 = "É crítica sutil ao atraso recorrente.",
            explicacao3 = "Não busca esclarecimento.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém diz “Você tem uma forma única de explicar” após um discurso confuso. Qual a indireta?",
            opcao1 = "Elogio à criatividade didática",
            opcao2 = "Ironia elegante sobre confusão",
            opcao3 = "Convite para detalhar melhor",
            respostaCorreta = 2,
            explicacao1 = "Não reconhece clareza.",
            explicacao2 = "Aponta de forma indireta a falta de coesão.",
            explicacao3 = "Não há convite genuíno.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Você sempre acerta” depois de um erro grosseiro. Qual é a indireta?",
            opcao1 = "Elogio sincero à competência",
            opcao2 = "Sarcasmo sofisticado sobre falha clara",
            opcao3 = "Pergunta sobre métodos de acerto",
            respostaCorreta = 2,
            explicacao1 = "Não reflete competência real.",
            explicacao2 = "É crítica indireta ao erro óbvio.",
            explicacao3 = "Não busca ensinamentos.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Em um grupo, alguém afirma “Que coesão maravilhosa” após enorme confusão. Qual a indireta fina?",
            opcao1 = "Elogio à união do grupo",
            opcao2 = "Ironia sutil sobre desordem",
            opcao3 = "Convite para unir melhor as ideias",
            respostaCorreta = 2,
            explicacao1 = "Não elogia união genuína.",
            explicacao2 = "Demonstra crítica à bagunça.",
            explicacao3 = "Não há proposta construtiva.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Que desempenho memorável” para alguém que falhou publicamente. Qual o sentido implícito?",
            opcao1 = "Elogio completo à performance",
            opcao2 = "Sarcasmo refinado sobre fracasso",
            opcao3 = "Pergunta sobre recordações futuras",
            respostaCorreta = 2,
            explicacao1 = "Não é elogio verdadeiro.",
            explicacao2 = "Ironiza o fracasso exposto.",
            explicacao3 = "Não há curiosidade real.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Alguém comenta “Você é inspirador” quando sua ideia é impraticável. Qual a indireta sofisticada?",
            opcao1 = "Elogio à criatividade prática",
            opcao2 = "Sarcasmo elegante sobre impraticabilidade",
            opcao3 = "Convite para inspirar outros",
            respostaCorreta = 2,
            explicacao1 = "Não reconhece factibilidade.",
            explicacao2 = "Aponta sutileza da falta de viabilidade.",
            explicacao3 = "Não busca motivar terceiros.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você ouve “Que perspectiva interessante” sobre um plano absurdo. Qual a indireta?",
            opcao1 = "Elogio à visão inovadora",
            opcao2 = "Ironia refinada sobre absurdo",
            opcao3 = "Solicitação de detalhes adicionais",
            respostaCorreta = 2,
            explicacao1 = "Não endossa inovação real.",
            explicacao2 = "Subtiliza crítica ao plano inviável.",
            explicacao3 = "Não há real interesse em mais detalhes.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Num debate, ouve-se “Excelente argumento” após fala sem lógica. Qual a indireta erudita?",
            opcao1 = "Elogio à qualidade lógica",
            opcao2 = "Sarcasmo culto sobre falta de lógica",
            opcao3 = "Pedido de mais exemplos",
            respostaCorreta = 2,
            explicacao1 = "Não valoriza argumento concreto.",
            explicacao2 = "Ironia sutil sobre incoerência.",
            explicacao3 = "Não busca ilustração.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você escuta “Que insight profundo” depois de comentário raso. Qual a indireta?",
            opcao1 = "Elogio à profundidade de pensamento",
            opcao2 = "Ironia elegante sobre superficialidade",
            opcao3 = "Pergunta sobre referências teóricas",
            respostaCorreta = 2,
            explicacao1 = "Não reconhece profundidade real.",
            explicacao2 = "Aponta de forma indireta que é raso.",
            explicacao3 = "Não demonstra real interesse.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega diz “Parabéns pela originalidade” para algo já muito clichê. Qual a indireta refinada?",
            opcao1 = "Elogio genuíno à criatividade",
            opcao2 = "Sarcasmo sutil sobre falta de inovação",
            opcao3 = "Convite para criar algo novo",
            respostaCorreta = 2,
            explicacao1 = "Não valoriza real inovação.",
            explicacao2 = "Ironiza o caráter clichê.",
            explicacao3 = "Não propõe novos caminhos.",
            dificuldadeNivel = 3
        )
    )
}
