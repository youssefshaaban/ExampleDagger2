package com.example.dagger.car_example.dagger

import com.example.dagger.MainActivity
import com.example.dagger.car_example.car.Care
import dagger.Binds
import dagger.BindsInstance
import dagger.Component

@Component(modules = [WhealsModule::class, PetrolEngineModule::class])
interface CareComponent {

    fun getCar(): Care
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindHorseBower(@HorsePower horsePower: Int): Builder// this value bind any int if object need inject ant value

        @BindsInstance
        fun bindCapacity(@Capacity capacity: Int): Builder

        fun build(): CareComponent
    }
}