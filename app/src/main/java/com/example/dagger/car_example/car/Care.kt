package com.example.dagger.car_example.car

import android.util.Log
import javax.inject.Inject

class Care @Inject constructor(val wheels: Wheels) {
    private  val TAG = "Care"
    @Inject lateinit var  engine: Engine

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(care = this)
    }
    fun drive() {
        engine.start()
        Log.d(TAG+"joe", " driving...... ")
    }
}