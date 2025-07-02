package com.github.mfilipeamorim.mundosocial.data.model

import androidx.room.*;

@Entity(tableName = "usuarios")
data class UsuarioEntity (
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val nome: String,
    val idade: Int,
    val ativo: Boolean = true
)

