package com.example.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RiverModule() {

    @Provides
    @Singleton
    fun provideRiver(): River = River()

}