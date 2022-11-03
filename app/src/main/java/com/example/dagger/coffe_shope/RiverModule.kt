package com.example.dagger.coffe_shope

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RiverModule() {

    @Provides
    @Singleton
    fun provideRiver(): River = River()

}