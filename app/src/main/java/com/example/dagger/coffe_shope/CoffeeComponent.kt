package com.example.dagger.coffe_shope

import com.example.dagger.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent
@ActivityScope
interface CoffeeComponent {

    fun getCoffee(): Coffee
  //  fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun sugar(@Sugar sugar: Int): Builder
        @BindsInstance
        fun milk(@Milk sugar: Int): Builder
        fun builder(): CoffeeComponent

    }
}