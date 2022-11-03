package com.example.dagger.car_example.dagger

import com.example.dagger.car_example.car.Rimes
import com.example.dagger.car_example.car.Tires
import com.example.dagger.car_example.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WhealsModule {

    @Provides
    fun provideRimes(): Rimes = Rimes()

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheal(rimes: Rimes, tires: Tires) = Wheels(rimes, tires)
}