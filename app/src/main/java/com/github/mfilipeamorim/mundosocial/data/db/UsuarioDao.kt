package com.github.mfilipeamorim.mundosocial.data.db

import androidx.room.*;
import com.github.mfilipeamorim.mundosocial.data.model.UsuarioEntity


@Dao
interface UsuarioDao {
    @Insert
    suspend fun inserir(usuario: UsuarioEntity): Long

    @Query("SELECT * FROM usuarios WHERE ativo = 1 LIMIT 1")
    suspend fun getUsuarioAtivo(): UsuarioEntity?

    @Query("UPDATE usuarios SET ativo = 0")
    suspend fun desativarTodos()

    @Query("SELECT * FROM usuarios")
    suspend fun listarTodos(): List<UsuarioEntity>
}