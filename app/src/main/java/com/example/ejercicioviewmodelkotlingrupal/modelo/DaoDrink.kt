package com.example.ejercicioviewmodelkotlingrupal.modelo

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface DaoDrink {

    @Insert
    suspend fun insertDrink(drinks: Drinks)

    @Insert
    suspend fun  insertDrinks(list: MutableList<Drinks>)

    @Query("DELETE FROM drinks")
    suspend fun  deleteAll()

    @Update
    suspend fun  updateDrink(drinks: Drinks)

    @Query("SELECT * FROM drinks")
    fun getDrunk(): LiveData<MutableList<Drinks>>
}