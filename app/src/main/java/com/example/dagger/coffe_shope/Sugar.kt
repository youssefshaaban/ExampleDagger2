package com.example.dagger.coffe_shope

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Sugar(
    /** The name.  */
    val value: String = "sugar"
)
