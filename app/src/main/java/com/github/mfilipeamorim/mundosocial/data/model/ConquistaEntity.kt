package com.github.mfilipeamorim.mundosocial.data.model

import androidx.room.*;

@Entity(tableName = "conquistas")
data class ConquistaEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val titulo: String,
    val descricao: String,
    val iconeRes: String,
    val desbloqueada: Boolean = false
)

