package com.github.mfilipeamorim.mundosocial.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.github.mfilipeamorim.mundosocial.data.model.CenarioEntity
import com.github.mfilipeamorim.mundosocial.data.model.HistoriaEntity
import com.github.mfilipeamorim.mundosocial.data.model.UsuarioEntity

@Database(
    entities = [
        UsuarioEntity::class,
        CenarioEntity::class,
        HistoriaEntity::class
    ],
    version = 3,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun usuarioDao(): UsuarioDao
    abstract fun cenarioDao(): CenarioDao
    abstract fun historiaDao(): HistoriaDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "mundo_social.db"
                )
                    .fallbackToDestructiveMigration() // enquanto em desenvolvimento
                    .build().also {
                        INSTANCE = it
                    }
            }
        }
    }
}
