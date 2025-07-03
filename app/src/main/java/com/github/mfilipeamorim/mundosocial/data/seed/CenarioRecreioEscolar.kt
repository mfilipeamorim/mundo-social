package com.github.mfilipeamorim.mundosocial.data.seed

import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity

object CenarioRecreioEscolar {
    fun historias(cenarioId: Long): List<HistoriaEntity> = listOf(
        // 10 Fáceis (nível 1)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Enquanto caminha pelo pátio, você avista um colega sentado sozinho em um canto, olhando para o chão, sem interagir com ninguém ao redor.",
            opcao1 = "Ignora e continua conversando com seus amigos",
            opcao2 = "Se aproxima e pergunta se ele quer brincar",
            opcao3 = "Faz piada com a situação para os outros rirem",
            respostaCorreta = 2,
            explicacao1 = "Ignorar pode reforçar o sentimento de exclusão do colega.",
            explicacao2 = "Convidar demonstra empatia e promove a inclusão.",
            explicacao3 = "Zombar provoca constrangimento e não resolve nada.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao dar uma volta no recreio, você percebe várias embalagens e papéis espalhados ao redor da lixeira, tornando o ambiente desordenado e sujo para todos.",
            opcao1 = "Anda por cima do lixo e ignora a bagunça",
            opcao2 = "Recolhe o lixo e joga na lixeira correta",
            opcao3 = "Faz vídeo reclamando nas redes sociais",
            respostaCorreta = 2,
            explicacao1 = "Ignorar deixa o espaço sujo e descuida do meio ambiente.",
            explicacao2 = "Limpar ajuda a manter a área agradável para todos.",
            explicacao3 = "Reclamar online não resolve o problema imediato.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um grupo de amigos convida você para jogar bola no campinho, mas olhar para o relógio mostra que está quase na hora de voltar para a sala de aula.",
            opcao1 = "Recusa para não se atrasar",
            opcao2 = "Entra na partida mesmo sabendo do atraso",
            opcao3 = "Fala que não sabe jogar bola",
            respostaCorreta = 1,
            explicacao1 = "Melhor evitar atraso que pode virar falta na aula.",
            explicacao2 = "Entrar pode causar problemas com o professor.",
            explicacao3 = "Mentir desestimula convites futuros sem necessidade.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Embaixo de uma grande árvore, você percebe um amigo que acabou de receber uma notícia triste e está chorando com a cabeça baixa, sem conseguir falar.",
            opcao1 = "Pergunta o que houve e oferece apoio",
            opcao2 = "Deixa-o sozinho pois não quer se envolver",
            opcao3 = "Chama atenção para os outros verem",
            respostaCorreta = 1,
            explicacao1 = "Oferecer apoio demonstra cuidado e amizade verdadeira.",
            explicacao2 = "Isolá-lo pode agravar o sofrimento emocional.",
            explicacao3 = "Expor a situação fere a privacidade e machuca mais.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você chega à fila do balanço e vê que várias crianças estão esperando, enquanto você está próximo do fim, observando o fluxo lento.",
            opcao1 = "Empurra os outros para furar a fila",
            opcao2 = "Espera pacientemente sua vez chegar",
            opcao3 = "Desiste e vai embora sem falar nada",
            respostaCorreta = 2,
            explicacao1 = "Furar a fila é desrespeitoso e coloca outros em perigo.",
            explicacao2 = "Esperar é demonstração de responsabilidade e respeito.",
            explicacao3 = "Desistir sem razão pode causar arrependimento depois.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao passar ao lado de um colega, você observa seu estojo aberto e espalhado no chão, lápis e canetas rolando no piso sem que ele perceba.",
            opcao1 = "Avisar para ele recolher seus materiais",
            opcao2 = "Aproveitar para pegar algo antes que ele veja",
            opcao3 = "Rir da situação e seguir seu caminho",
            respostaCorreta = 1,
            explicacao1 = "Avisar demonstra solidariedade e ajuda prática.",
            explicacao2 = "Pegar itens é desonesto e pega o colega desprevenido.",
            explicacao3 = "Rir desvaloriza o colega e não resolve nada.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Na grande mesa do recreio, um aluno novo chega com sua bandeja de lanche, mas não encontra lugar vazio para se sentar com tranquilidade.",
            opcao1 = "Falar que a mesa está cheia e nada pode fazer",
            opcao2 = "Levantar para dar lugar a ele ao lado",
            opcao3 = "Oferecer parte do seu lanche mas manter o lugar",
            respostaCorreta = 2,
            explicacao1 = "Recusar ajuda demonstra falta de empatia.",
            explicacao2 = "Ceder o lugar acolhe o colega e incentiva amizade.",
            explicacao3 = "Dividir o lanche sem espaço não resolve o problema de lugar.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você nota que um colega está aprendendo um novo jogo de tabuleiro e, mesmo errando várias vezes, tenta entender as regras e participar do grupo.",
            opcao1 = "Ignora e joga com quem já sabe",
            opcao2 = "Ensina as regras de forma paciente e gentil",
            opcao3 = "Fala que ele nunca será bom naquele jogo",
            respostaCorreta = 2,
            explicacao1 = "Ignorar deixa o colega desmotivadx a continuar aprendendo.",
            explicacao2 = "Ensinar com paciência estimula o aprendizado e a amizade.",
            explicacao3 = "Desencorajar com críticas negativas prejudica a autoestima.",
            dificuldadeNivel = 1
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Depois de uma chuva forte, o chão do parque de brinquedos está escorregadio, com poças d’água e riscos de quedas para quem não perceber o problema.",
            opcao1 = "Corre e escorrega junto com os outros",
            opcao2 = "Sinaliza o perigo para os colegas com cuidado",
            opcao3 = "Ignora e continua como se nada tivesse acontecido",
            respostaCorreta = 2,
            explicacao1 = "Correr em piso molhado aumenta o risco de acidentes.",
            explicacao2 = "Avisar previne machucados e mostra responsabilidade.",
            explicacao3 = "Ignorar coloca todos em risco sem tomar providência.",
            dificuldadeNivel = 1
        ),

        // 10 Médias (nível 2)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "No recreio, você vê um grupo brincando de amarelinha, mas um colega tenta participar e não entende as regras claramente como os demais.",
            opcao1 = "Fala que ele não pode brincar se não souber",
            opcao2 = "Explica as regras e convida para tentar junto",
            opcao3 = "Deixa ele assistir, mas não deixa entrar na brincadeira",
            respostaCorreta = 2,
            explicacao1 = "Exclusão desmotiva e gera constrangimento.",
            explicacao2 = "Ensinar promove aprendizado e inclusão.",
            explicacao3 = "Só observar não ajuda o colega a participar.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você nota uma criança chorando porque esqueceu o lanche em casa e está com fome durante o recreio, sem ter como se alimentar.",
            opcao1 = "Oferece parte do seu lanche, cortêsmente",
            opcao2 = "Ignora, pois cada um é responsável pelo seu lanche",
            opcao3 = "Faz piada dizendo que deveria ter lembrado",
            respostaCorreta = 1,
            explicacao1 = "Compartilhar demonstra solidariedade.",
            explicacao2 = "Negar ajuda ignora uma necessidade imediata.",
            explicacao3 = "Zombar agrava a situação emocional.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante a atividade de pular corda em grupo, você percebe que a corda passou por cima de um colega e ele caiu no chão sentindo dor.",
            opcao1 = "Ajuda-o a levantar e pergunta se está bem",
            opcao2 = "Continua pulando para não estragar a diversão",
            opcao3 = "Diz que ele deveria prestar mais atenção",
            respostaCorreta = 1,
            explicacao1 = "Prestar auxílio demonstra empatia e responsabilidade.",
            explicacao2 = "Ignorar lesões pode levar a acidentes mais graves.",
            explicacao3 = "Culpar não resolve a dor ou previne acidentes.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você encontra um colega reclamando que outro jogador está trapaceando no jogo de cartas no recreio, gerando desconfiança entre o grupo.",
            opcao1 = "Diz que todos trapaceiam às vezes, não liga",
            opcao2 = "Intervém, confirma a regra e sugere refazer a rodada",
            opcao3 = "Encara o trapaceiro para intimidar",
            respostaCorreta = 2,
            explicacao1 = "Minimizar a queixa não resolve o problema.",
            explicacao2 = "Verificar regras garante jogo justo.",
            explicacao3 = "Intimidação cria clima de medo e tensão.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Percebe-se que um colega está isolado embaixo da escada e os outros evitam sentar perto dele, deixando-o ainda mais sozinho.",
            opcao1 = "Sentar próximo e puxar conversa amigável",
            opcao2 = "Ficar com o seu grupo sem se aproximar",
            opcao3 = "Brincar de esconde-esconde longe dali",
            respostaCorreta = 1,
            explicacao1 = "Aproximar ajuda a quebrar o isolamento.",
            explicacao2 = "Não fazer nada mantém o colega sozinho.",
            explicacao3 = "Ignorar impede qualquer conexão social.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega pede ajuda para resolver um problema de matemática que será cobrado na próxima aula, e ele está claramente tendo dificuldade.",
            opcao1 = "Ajuda explicando passo a passo, pacientemente",
            opcao2 = "Diz para ele procurar outro colega mais rápido",
            opcao3 = "Recusa dizendo que você também não sabe muito",
            respostaCorreta = 1,
            explicacao1 = "Ensinar reforça conhecimento e cooperação.",
            explicacao2 = "Transferir responsabilidade não ajuda ninguém.",
            explicacao3 = "Negar sem tentar prejudica a aprendizagem.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Ao ver um colega usar o celular em hora proibida no recreio, você sabe que ele pode ter problema se for pego pelo professor.",
            opcao1 = "Denuncia para o professor imediatamente",
            opcao2 = "Alerta o colega e sugere guardar o aparelho",
            opcao3 = "Faz de conta que não viu nada",
            respostaCorreta = 2,
            explicacao1 = "Denunciar pode causar constrangimento desnecessário.",
            explicacao2 = "Avisar ajuda o colega a evitar punição.",
            explicacao3 = "Ignorar não protege o colega de consequências.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você observa um amigo que costuma brincar de escalada no muro, mas hoje o muro está molhado e escorregadio, aumentando o risco de queda.",
            opcao1 = "Avisa sobre o risco e sugere outro jogo seguro",
            opcao2 = "Faz apostas para ver quem escala mais rápido",
            opcao3 = "Filma o amigo e posta nas redes sociais",
            respostaCorreta = 1,
            explicacao1 = "Prevenir acidentes demonstra cuidado.",
            explicacao2 = "Apostar incentiva comportamento de risco.",
            explicacao3 = "Expor sem consentimento fere privacidade.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante a partida de queimada, um jogador cai e machuca o braço, mas insiste em continuar jogando apesar da dor intensa.",
            opcao1 = "Permite que ele continue se quiser",
            opcao2 = "Convida-o a ir à enfermaria enquanto alguém assume o lugar",
            opcao3 = "Ignora e continua jogando normalmente",
            respostaCorreta = 2,
            explicacao1 = "Autonomia é importante, mas saúde vem primeiro.",
            explicacao2 = "Buscar ajuda médica evita complicações.",
            explicacao3 = "Ignorar uma lesão pode agravar o problema.",
            dificuldadeNivel = 2
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você nota que um colega está com o uniforme sujo após cair na lama e parece visivelmente envergonhado perto dos demais.",
            opcao1 = "Faz comentário sobre a sujeira para rir",
            opcao2 = "Diz que não é nada e oferece ajuda para limpar",
            opcao3 = "Afasta-se para não se sujar também",
            respostaCorreta = 2,
            explicacao1 = "Zombar causa constrangimento e exclusão.",
            explicacao2 = "Apoiar mostra empatia e praticidade.",
            explicacao3 = "Evitar não resolve o desconforto do colega.",
            dificuldadeNivel = 2
        ),

        // 10 Difíceis (nível 3)
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você observa um colega que sofre bullying verbal por um grupo maior no recreio e parece cada vez mais abatido e isolado.",
            opcao1 = "Finge que não está vendo para evitar conflitos",
            opcao2 = "Intervém pedindo para pararem e oferece apoio ao colega",
            opcao3 = "Grava a cena para postar nas redes sociais depois",
            respostaCorreta = 2,
            explicacao1 = "Ignorar perpetua o bullying e deixa a vítima desamparada.",
            explicacao2 = "Intervir protege a vítima e demonstra coragem cívica.",
            explicacao3 = "Gravar explora a situação e fere ainda mais o colega.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante o recreio, você percebe que uma criança com mobilidade reduzida está esperando ajuda para ir do escorregador até o banco de descanso.",
            opcao1 = "Chama a atenção de um monitor para ajudar",
            opcao2 = "Oferece auxílio e acompanha o deslocamento dela",
            opcao3 = "Aguarda que outro colega ofereça ajuda primeiro",
            respostaCorreta = 2,
            explicacao1 = "Chamar monitor pode atrasar o socorro e limitar autonomia.",
            explicacao2 = "Ajudar diretamente valoriza a independência e a empatia.",
            explicacao3 = "Esperar desperdicia tempo e mantém o colega aguardando.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você percebe sinais de tristeza intensa em um colega, que comenta sentir-se sem propósito e desmotivado para voltar às aulas.",
            opcao1 = "Sussurra que isso é apenas drama e segue brincando",
            opcao2 = "Convida-o para conversar em um lugar calmo e escuta com atenção",
            opcao3 = "Ignora, pois não sabe como lidar com o assunto",
            respostaCorreta = 2,
            explicacao1 = "Desmerecer sentimentos agrava o isolamento emocional.",
            explicacao2 = "Ouvir sem julgar fortalece vínculos e amplia suporte.",
            explicacao3 = "Ignorar impede que a pessoa receba ajuda necessária.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um colega revela que está passando por dificuldades financeiras e não consegue pagar a viagem escolar; alguns colegas fazem comentários maldosos.",
            opcao1 = "Defende o colega e sugere uma vaquinha para ajudar",
            opcao2 = "Faz piada para aliviar o clima e distrair todos",
            opcao3 = "Permanece em silêncio para não se envolver",
            respostaCorreta = 1,
            explicacao1 = "Defender e organizar ajuda prática fortalece a empatia.",
            explicacao2 = "Piadas podem ofender e não resolvem o problema real.",
            explicacao3 = "Silêncio mantém a injustiça sem qualquer solução.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você flagra outra criança furtando lanches e brinquedos de colegas e escondendo na mochila, causando prejuízo emocional e material.",
            opcao1 = "Confronta e exige que devolva tudo imediatamente",
            opcao2 = "Leva discretamente ao professor e explica o ocorrido",
            opcao3 = "Pega os objetos de volta sem dizer nada e guarda",
            respostaCorreta = 2,
            explicacao1 = "Confronto direto pode gerar reação violenta ou embaraço.",
            explicacao2 = "Reportar ao professor resolve de forma adequada e segura.",
            explicacao3 = "Retirar por conta própria não corrige a causa do furto.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Durante um debate no recreio, você ouve um colega proferir comentários discriminatórios de cunho étnico e religioso.",
            opcao1 = "Ria para não chamar atenção e seguir o recreio tranquilo",
            opcao2 = "Rebate imediatamente, explicando por que comentários assim são ofensivos",
            opcao3 = "Foge da discussão para evitar desentendimentos",
            respostaCorreta = 2,
            explicacao1 = "Rir silencia a injustiça e normaliza o preconceito.",
            explicacao2 = "Confrontar com argumentos educa e defende valores de respeito.",
            explicacao3 = "Fugir abandona a vítima e mantém o discurso discriminatório.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você nota um aluno que apresenta sinais de desidratação e cansaço extremo após brincar sem parar sob o sol intenso do recreio.",
            opcao1 = "Oferece água e sugere descanso à sombra",
            opcao2 = "Ignora e continua brincando para não interromper a diversão",
            opcao3 = "Brinca de molhar com a mangueira para rir dos que reclamam",
            respostaCorreta = 1,
            explicacao1 = "Oferecer cuidados imediatos previne problemas de saúde.",
            explicacao2 = "Ignorar pode levar a desmaios e complicações sérias.",
            explicacao3 = "Zombar da situação pode ser perigoso e insensível.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Um aluno que passa por tratamento de saúde retorna ao recreio visivelmente fraco e sem energia para acompanhar os colegas.",
            opcao1 = "Escolhe outro grupo para não deixá-lo desconfortável",
            opcao2 = "Pergunta como está se sentindo e adapta brincadeiras mais leves",
            opcao3 = "Pede para que ele não venha brincar para não atrapalhar",
            respostaCorreta = 2,
            explicacao1 = "Isolar fere a autoestima e impede a socialização.",
            explicacao2 = "Adaptar atividades demonstra empatia e inclusão real.",
            explicacao3 = "Impedir a participação desmotiva e exclui o colega.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você presencia uma discussão acalorada entre colegas que ameaça evoluir para agressão física durante o intervalo.",
            opcao1 = "Filma para ter prova caso precise usar depois",
            opcao2 = "Intervém calmamente, separando-os e pedindo para se acalmarem",
            opcao3 = "Ignora e tenta se afastar para não se envolver",
            respostaCorreta = 2,
            explicacao1 = "Filmar é passivo e não evita a violência iminente.",
            explicacao2 = "Intervir com calma pode desescalar o conflito rapidamente.",
            explicacao3 = "Fugir permite que a situação saia do controle.",
            dificuldadeNivel = 3
        ),
        HistoriaEntity(
            cenarioId = cenarioId,
            descricao = "Você descobre que um colega está sofrendo de bullying virtual por mensagens ofensivas enviadas nas redes antes do recreio.",
            opcao1 = "Recomenda que ignore as mensagens e não mencione nada",
            opcao2 = "Oferece apoio emocional e sugere falar com um responsável ou psicólogo",
            opcao3 = "Encaminha capturas de tela para outros colegas para criticar o agressor",
            respostaCorreta = 2,
            explicacao1 = "Ignorar sem suporte não resolve o sofrimento emocional.",
            explicacao2 = "Buscar ajuda profissional e apoio social é a melhor solução.",
            explicacao3 = "Compartilhar pode expor ainda mais a vítima e gerar mais bullying.",
            dificuldadeNivel = 3
        )
    )
}
