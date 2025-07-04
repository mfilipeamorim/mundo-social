package com.github.mfilipeamorim.mundosocial.data.model

import androidx.room.*;

@Entity(tableName = "historico")
data class HistoricoEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val cenarioId: Long,
    val historiaId: Long,
    val acertou: Boolean,
    val opcaoEscolhida: Int,
    val timestamp: Long
)
