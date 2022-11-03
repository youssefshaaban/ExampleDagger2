package com.example.dagger.car_example.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(val horsePower:Int) : Engine {
    companion object {
        private const val TAG = "PetrolEngine Care"
    }

    override fun start() {
        Log.d(TAG, "Start: Petrol Engine $horsePower")
    }
}