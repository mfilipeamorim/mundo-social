package com.github.mfilipeamorim.mundosocial.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cenarios")
data class CenarioEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val titulo: String,
    val nivel: Int
)