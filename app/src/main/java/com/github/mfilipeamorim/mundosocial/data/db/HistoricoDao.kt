package com.github.mfilipeamorim.mundosocial.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.github.mfilipeamorim.mundosocial.data.model.HistoricoEntity

@Dao
interface HistoricoDao {

    @Insert
    suspend fun inserir(historico: HistoricoEntity)

    @Query("SELECT * FROM historico ORDER BY timestamp DESC")
    suspend fun listarTodos(): List<HistoricoEntity>

    @Query("SELECT * FROM historico WHERE acertou = 1 ORDER BY timestamp DESC")
    suspend fun listarAcertos(): List<HistoricoEntity>

    @Query("SELECT * FROM historico WHERE acertou = 0 ORDER BY timestamp DESC")
    suspend fun listarErros(): List<HistoricoEntity>

    @Query("SELECT COUNT(*) FROM historico")
    suspend fun contarTodos(): Int
}
