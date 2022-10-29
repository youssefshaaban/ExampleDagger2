package com.example.dagger

import android.util.Log
import javax.inject.Inject


class River {
    val TAG ="River"
    init {
        Log.d(TAG, "yousef: river")
    }
    fun getWater():String="water"

}