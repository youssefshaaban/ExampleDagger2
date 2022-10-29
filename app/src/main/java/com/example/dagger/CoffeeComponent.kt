package com.example.dagger

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Subcomponent
@ActivityScope
interface CoffeeComponent {

    fun getCoffee(): Coffee
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun sugar(@Sugar sugar: Int): Builder
        @BindsInstance
        fun milk(@Milk sugar: Int): Builder
        fun builder(): CoffeeComponent

    }
}