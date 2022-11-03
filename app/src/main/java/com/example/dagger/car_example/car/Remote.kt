package com.example.dagger.car_example.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    private lateinit var care: Care
    private  val TAG = "Remote Care"

    fun setListener(care: Care) {
        this.care = care
        Log.d(TAG, " setListener: enable remote ")
    }
}