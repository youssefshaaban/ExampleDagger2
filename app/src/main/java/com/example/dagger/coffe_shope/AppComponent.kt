package com.example.dagger.coffe_shope

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RiverModule::class])
interface AppComponent {
    fun getCoffeeCompanent(): CoffeeComponent.Builder
}