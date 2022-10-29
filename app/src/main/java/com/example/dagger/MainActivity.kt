package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.test.dagger.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    lateinit var coffee: Coffee
    @Inject
    lateinit var coffee2: Coffee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent=(application as com.example.dagger.MyApp).appComponent
        val coffeeComponent=appComponent.getCoffeeCompanent().milk(4).sugar(4).builder()
        coffeeComponent.inject(this)
        Log.e(TAG, "yousef on create " + coffee.getCoffeeCup()+
                "\ncoffee 1 $coffee"
                +"\ncoffee2 $coffee2"+
                "\nfarm for coffee1 ${coffee.river}" +"\nfarm for coffee2 ${coffee2.river}")
    }
}