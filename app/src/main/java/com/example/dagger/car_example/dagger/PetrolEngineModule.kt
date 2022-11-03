package com.example.dagger.car_example.dagger

import com.example.dagger.car_example.car.Engine
import com.example.dagger.car_example.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine): Engine
}