package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger.car_example.car.Care
import com.test.dagger.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    @Inject
    lateinit var care: Care
    @Inject
    lateinit var care2: Care
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activityComponent=(application as MyApp).appComponent.getAcitvityComponent()
        activityComponent.inject(this)
        care.drive()
        care2.drive()
    }
}