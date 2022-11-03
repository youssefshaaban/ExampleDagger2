package com.example.dagger.car_example.car

import android.util.Log
import javax.inject.Inject

class DieselEngine(val horse:Int) : Engine {
    companion object {
        private const val TAG = "DieselEngine Care"
    }
    override fun start() {
        Log.d(TAG, "start: DieselEngine horse engine $horse")
    }
}