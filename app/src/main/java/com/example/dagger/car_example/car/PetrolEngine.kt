package com.example.dagger.car_example.car

import android.util.Log
import com.example.dagger.car_example.dagger.Capacity
import com.example.dagger.car_example.dagger.HorsePower
import javax.inject.Inject

class PetrolEngine @Inject constructor(@HorsePower val horsePower:Int, @Capacity val capacity:Int) : Engine {
    companion object {
        private const val TAG = "PetrolEngine Care"
    }

    override fun start() {
        Log.d(TAG, "Start: Petrol Engine $horsePower")
    }
}