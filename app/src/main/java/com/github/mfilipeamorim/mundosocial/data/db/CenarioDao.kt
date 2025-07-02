package com.github.mfilipeamorim.mundosocial.data.db

import androidx.room.*
import com.github.mfilipeamorim.mundosocial.data.model.CenarioEntity

@Dao
interface CenarioDao {

    @Insert
    suspend fun inserir(cenario: CenarioEntity): Long

    @Query("SELECT * FROM cenarios ORDER BY nivel")
    suspend fun listarTodos(): List<CenarioEntity>

    @Query("SELECT * FROM cenarios WHERE id = :id")
    suspend fun buscarPorId(id: Long): CenarioEntity?
}
