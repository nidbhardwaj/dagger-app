package com.example.daggerapplication.data

import android.util.Log

class Company(vision: Vision, employee: Employee) {

    fun generateProfits(){
        Log.d(this.javaClass.name, "Money")
    }
}