package com.example.daggerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerapplication.data.Company
import com.example.daggerapplication.data.Employee
import com.example.daggerapplication.data.Vision

class MainActivity : AppCompatActivity() {

    lateinit var company: Company
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        company = Company(Vision(), Employee())
        company.generateProfits()
    }
}
