package com.example.dagger.car_example.dagger

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DieselEngineModule::class])
interface AppComponent {
    fun getAcitvityComponent(): ActivityComponent;

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindHorseBower(@HorsePower horsePower: Int): Builder// this value bind any int if object need inject ant value
        @BindsInstance
        fun bindCapacity(@Capacity capacity: Int): Builder// this value bind any int if object need inject ant value

        fun binDieaselModule(dieselEngineModule: DieselEngineModule): Builder

        fun build(): AppComponent
    }
}