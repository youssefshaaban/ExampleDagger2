package com.example.dagger.car_example.car

import android.util.Log

// this class for preview can't inject conustractor
class Tires{
    companion object{
        private const val TAG = "Tires Care"
    }
    fun inflate(){
        Log.d(TAG, "inflate: Tires inflating")
    }
}
