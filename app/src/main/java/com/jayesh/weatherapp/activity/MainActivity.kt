package com.jayesh.weatherapp.activity

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jayesh.weatherapp.R
import com.jayesh.weatherapp.fragment.SettingsFragment
import com.jayesh.weatherapp.fragment.CurrentWeatherFragment
import com.jayesh.weatherapp.fragment.HistoryFragment
import com.jayesh.weatherapp.fragment.SearchFragment

class MainActivity : AppCompatActivity() {
    lateinit var frameLayout: FrameLayout
    lateinit var bnMain: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        frameLayout = findViewById(R.id.frameLayout)
        bnMain = findViewById(R.id.bnMain)

        setDefaultFragment()

        //setting click listeners on menu items
        bnMain.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.itmCurrent -> {
                    setDefaultFragment()
                    true
                }

                R.id.itmAbout -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, SettingsFragment())
                        .commit()
                    true
                }

                R.id.itmSearch -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, SearchFragment())
                        .commit()
                    true
                }

                R.id.itmHistory -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, HistoryFragment())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }

    private fun setDefaultFragment() {

        val fragment = CurrentWeatherFragment(false)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, CurrentWeatherFragment(false))
        transaction.commit()
    }

    override fun onBackPressed() {
        val current = supportFragmentManager.findFragmentById(R.id.frameLayout)

        if (current != CurrentWeatherFragment(false)) {
            setDefaultFragment()
        } else {
            super.onBackPressed()
        }
    }
}