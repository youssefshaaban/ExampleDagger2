package com.example.dagger.coffe_shope

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Milk(
    /** The name.  */
    val value: String = "Milk"
)
