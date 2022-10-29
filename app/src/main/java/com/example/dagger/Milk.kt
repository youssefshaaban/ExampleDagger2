package com.example.dagger

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Milk(
    /** The name.  */
    val value: String = "Milk"
)
