package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger.car_example.car.Care
import com.example.dagger.car_example.dagger.DaggerCareComponent
import com.test.dagger.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    @Inject
    lateinit var care: Care
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCareComponent.builder().bindHorseBower(140).bindCapacity(200).build().inject(this)
        care.drive()
    }
}