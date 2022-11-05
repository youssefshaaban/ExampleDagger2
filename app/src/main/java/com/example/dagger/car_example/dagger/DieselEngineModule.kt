package com.example.dagger.car_example.dagger

import com.example.dagger.car_example.car.DieselEngine
import com.example.dagger.car_example.car.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DieselEngineModule {

    @Provides
    @Singleton
    fun provideDiesleEngine(@HorsePower horsePower: Int,@Capacity capacity: Int): Engine = DieselEngine(horsePower)
}