package com.github.mfilipeamorim.mundosocial.data.db

import androidx.room.*
import com.github.mfilipeamorim.mundosocial.data.model.UsuarioEntity

@Dao
interface UsuarioDao {
    @Insert
    suspend fun inserir(usuario: UsuarioEntity): Long

    @Update
    suspend fun atualizar(usuario: UsuarioEntity)

    @Query("SELECT * FROM usuarios LIMIT 1")
    suspend fun getPrimeiroUsuario(): UsuarioEntity?

    @Query("UPDATE usuarios SET ativo = 0")
    suspend fun desativarTodos()

    @Query("SELECT * FROM usuarios")
    suspend fun listarTodos(): List<UsuarioEntity>
}
