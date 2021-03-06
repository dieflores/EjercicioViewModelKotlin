package com.example.ejercicioviewmodelkotlingrupal.modelo

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Drinks::class), version = 0)

abstract class DrinksRoomDB: RoomDatabase() {

    abstract fun getDao(): DaoDrink

    companion object {
        var db: DrinksRoomDB? = null
        private val dbName: String = "drinker_DB"

        fun getDB(context: Context): DrinksRoomDB {
            if (db != null)
                return db!!

            synchronized(this) {
                db = Room.databaseBuilder(context, DrinksRoomDB::class.java, dbName).build()
                return db!!
            }
        }
    }

}