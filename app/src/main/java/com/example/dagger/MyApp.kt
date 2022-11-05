package com.example.dagger

import android.app.Application
import com.example.dagger.car_example.dagger.AppComponent
import com.example.dagger.car_example.dagger.DaggerAppComponent
import com.example.dagger.car_example.dagger.DieselEngineModule


class MyApp : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
       appComponent= DaggerAppComponent.builder()
            .bindHorseBower(100).bindCapacity(120)
            .binDieaselModule(DieselEngineModule()).build()
    }
}
