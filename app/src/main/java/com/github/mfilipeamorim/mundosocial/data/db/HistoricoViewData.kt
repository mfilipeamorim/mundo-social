package com.github.mfilipeamorim.mundosocial.data.db

import com.github.mfilipeamorim.mundosocial.data.model.HistoricoEntity

data class HistoricoViewData(
    val historico: HistoricoEntity,
    val descricaoHistoria: String,
    val tituloCenario: String,
    val opcaoEscolhida: String,
    val explicacao: String
)