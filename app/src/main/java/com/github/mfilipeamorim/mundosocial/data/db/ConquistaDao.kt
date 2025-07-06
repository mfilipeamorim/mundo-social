package com.github.mfilipeamorim.mundosocial.data.db

import androidx.room.*;
import com.github.mfilipeamorim.mundosocial.data.model.ConquistaEntity

@Dao
interface ConquistaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserir(conquista: ConquistaEntity)

    @Query("SELECT * FROM conquistas WHERE desbloqueada = 1")
    suspend fun listarDesbloqueadas(): List<ConquistaEntity>

    @Query("SELECT * FROM conquistas")
    suspend fun listarTodas(): List<ConquistaEntity>

    @Query("UPDATE conquistas SET desbloqueada = 1 WHERE id = :id")
    suspend fun desbloquear(id: Long)


}
