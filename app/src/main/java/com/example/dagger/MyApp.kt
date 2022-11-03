package com.example.dagger

import android.app.Application
import com.example.dagger.coffe_shope.AppComponent
import com.example.dagger.coffe_shope.DaggerAppComponent

class MyApp : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}