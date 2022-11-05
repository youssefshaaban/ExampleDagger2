package com.example.dagger.car_example.dagger

import com.example.dagger.car_example.car.Engine
import com.example.dagger.car_example.car.PetrolEngine
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class PetrolEngineModule {
    @Binds
    @Singleton
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine): Engine
}