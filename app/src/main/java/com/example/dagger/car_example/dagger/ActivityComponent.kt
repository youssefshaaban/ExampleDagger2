package com.example.dagger.car_example.dagger

import com.example.dagger.MainActivity
import com.example.dagger.car_example.car.Care
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [WhealsModule::class]
)
interface ActivityComponent {

    fun getCar(): Care
    fun inject(mainActivity: MainActivity)

}