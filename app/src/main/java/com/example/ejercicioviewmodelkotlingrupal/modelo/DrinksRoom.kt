package com.example.ejercicioviewmodelkotlingrupal.modelo

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Drinks::class), version = 0)

abstract class DrinksRoom(application: Application): RoomDatabase(){

    abstract fun getDao(): DaoDrink


    companion object{
        var db: DrinksRoom? = null
        private val dbName:String = "Drinker_DB"

        fun getDB(context: Context):DrinksRoom{
            if (db ! = null)
            return db!!

            synchronized(this){
                db = Room.databaseBuilder(context, DrinksRoom::class.java, dbName).build()
            }
        }
    }
}