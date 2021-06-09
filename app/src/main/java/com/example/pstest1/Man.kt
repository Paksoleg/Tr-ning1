package com.example.pstest1

import android.util.Log

class Man(val name : String, val surName : String) : Clothes {
    private val TAG = Man::class.java.simpleName

    override fun getClothes(degr : Int) {
        Log.e(TAG, "degr $degr")
        if (degr >0) {
            Log.e(TAG, "warm")
        }else {
            Log.e(TAG, "cold")
        }
    }
}