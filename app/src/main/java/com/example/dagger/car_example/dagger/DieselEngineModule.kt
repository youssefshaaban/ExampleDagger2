package com.example.dagger.car_example.dagger

import com.example.dagger.car_example.car.DieselEngine
import com.example.dagger.car_example.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower: Int) {

    @Provides
    fun provideDiesleEngine(): Engine = DieselEngine(horsePower)
}