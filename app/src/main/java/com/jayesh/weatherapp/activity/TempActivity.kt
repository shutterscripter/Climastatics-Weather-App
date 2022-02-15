package com.jayesh.weatherapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jayesh.weatherapp.R

class TempActivity : AppCompatActivity() {
    lateinit var txtTest: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)

        txtTest = findViewById(R.id.txtTest)

        val lat = intent?.getStringExtra("lat")
        val searchText = intent.getStringExtra("tempt").toString()
        txtTest.text = searchText

    }
}