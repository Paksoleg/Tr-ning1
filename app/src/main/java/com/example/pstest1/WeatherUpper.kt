package com.example.pstest1
import  android.os.Handler
import java.util.*

import kotlin.concurrent.thread

class WeatherUpper {
    private val people:MutableList<Clothes> = LinkedList()
    var degr = 0

    fun  addMan (clothes:Clothes){
        people.add(clothes)
    }

    fun removeMan(clothes: Clothes){
        people.remove(clothes)
    }

    fun getWeather(){
        degr = Random().nextInt(400)
        people.forEach(){
            it.getClothes(degr = degr)
        }

    val handler = Handler()
        handler.postDelayed({
            getWeather()
        }, 2000)

    }

}