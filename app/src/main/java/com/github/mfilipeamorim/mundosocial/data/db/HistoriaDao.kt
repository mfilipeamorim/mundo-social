package com.github.mfilipeamorim.mundosocial.data.db

import androidx.room.*
import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity

@Dao
interface HistoriaDao {

    @Insert
    suspend fun inserir(historia: HistoriaEntity): Long

    @Query("SELECT * FROM historias WHERE cenarioId = :cenarioId AND dificuldadeNivel = :nivel")
    suspend fun listarPorCenarioENivel(cenarioId: Long, nivel: Int): List<HistoriaEntity>

    @Query("SELECT * FROM historias WHERE cenarioId = :cenarioId")
    suspend fun listarPorCenario(cenarioId: Long): List<HistoriaEntity>

    @Query("SELECT * FROM historias WHERE id = :id")
    suspend fun buscarPorId(id: Long): HistoriaEntity?
}
