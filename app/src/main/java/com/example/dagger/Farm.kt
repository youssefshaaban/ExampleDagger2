package com.example.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton
@ActivityScope
class Farm @Inject constructor() {
    val TAG ="River"
    init {
        Log.d(TAG, "yousef: Farm")
    }
    fun getFarm():String="Beans"
}