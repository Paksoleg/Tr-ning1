package com.example.pstest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherUpper = WeatherUpper()
        weatherUpper.addMan(Man(name ="" , surName ="" ))

        weatherUpper.getWeather()


    }
}