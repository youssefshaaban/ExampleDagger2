package com.example.dagger.coffe_shope

import android.util.Log
import javax.inject.Inject

@ActivityScope
class Coffee @Inject constructor(val river: River, @Sugar val sugar:Int, @Milk val milk:Int) {
    private  val TAG = "Coffee"
    @Inject
    lateinit var farm: Farm

    @Inject
    fun connectEctricty(){
        Log.e(TAG, "yousef connectEctricty: connecting....")
    }
    fun getCoffeeCup(): String {
        return "${farm.getFarm()} + ${river.getWater()} sugar: $sugar milk: $milk"
    }
}