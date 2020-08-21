package com.example.ejercicioviewmodelkotlingrupal.modelo

class DrinkRepository(val dao: DaoDrink) {

    suspend fun insertDrink(drinks: Drinks)

    }