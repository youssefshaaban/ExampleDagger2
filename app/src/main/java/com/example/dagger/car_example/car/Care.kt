package com.example.dagger.car_example.car

import android.util.Log
import com.example.dagger.car_example.dagger.ActivityScope
import javax.inject.Inject

@ActivityScope
class Care @Inject constructor(val driver: Driver,val wheels: Wheels) {
    private  val TAG = "Care"
    @Inject lateinit var  engine: Engine

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(care = this)
    }
    fun drive() {
        engine.start()
        Log.d(TAG+"joe", "driver $driver is driving...... car $this engin in the car $engine")
    }
}