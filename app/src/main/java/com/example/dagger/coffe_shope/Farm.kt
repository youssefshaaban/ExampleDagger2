package com.example.dagger.coffe_shope

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Farm @Inject constructor() {
    val TAG ="River"
    init {
        Log.d(TAG, "yousef: Farm")
    }
    fun getFarm():String="Beans"
}