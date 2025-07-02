package com.github.mfilipeamorim.mundosocial.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "historias")
data class HistoriaEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val cenarioId: Long,
    val descricao: String,
    val opcao1: String,
    val opcao2: String,
    val opcao3: String,
    val respostaCorreta: Int, // 1, 2 ou 3
    val explicacao1: String,
    val explicacao2: String,
    val explicacao3: String,
    val dificuldadeNivel: Int
)
