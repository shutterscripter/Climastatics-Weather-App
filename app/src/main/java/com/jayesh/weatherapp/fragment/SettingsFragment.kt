package com.jayesh.weatherapp.fragment

import android.content.Context
import android.content.DialogInterface
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat.recreate
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.jayesh.weatherapp.R

const val FIRST_START = "FirstStart"
const val NIGHT_MODE = "NightMode"
const val PREF = "AppSettingsPrefs"

class SettingsFragment : Fragment() {
    lateinit var mToolbar: MaterialToolbar
    lateinit var cvunit: CardView
    lateinit var cvAbout: CardView


    private lateinit var selectedItem: String
    private var selectedItemIndex: Int = 0
    private val item = arrayOf("Celsius", "Fahrenheit")
    var status = false

    private val themeItem = arrayOf("Light", "Dark")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        cvunit = view.findViewById(R.id.cvUnit)
        cvAbout = view.findViewById(R.id.cvAbout)
        mToolbar = view.findViewById(R.id.mToolbar)


        //toolbar back button click
        mToolbar.setNavigationOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.frameLayout, CurrentWeatherFragment(status))
                ?.commit()
        }


        //Unit changing feature
        cvunit.setOnClickListener {
            showRadioConfirmationDialog()
        }

        cvAbout.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.frameLayout, AboutFragment())
                ?.commit()
        }


        return view
    }

    // fun for showing dialog with Radio Button for Unit settings
    private fun showRadioConfirmationDialog() {

        selectedItem = item[selectedItemIndex]
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Select the Unit")
            .setSingleChoiceItems(item, selectedItemIndex) { dialog_, which ->
                selectedItemIndex = which
                selectedItem = item[which]
            }
            .setPositiveButton("Ok") { dialog, which ->
                val sharedPreferences: SharedPreferences? =
                    activity?.getSharedPreferences("status", Context.MODE_PRIVATE)

                when (selectedItem) {
                    "Fahrenheit" -> {
                        status = true
                        sharedPreferences?.edit()
                            ?.putInt("F", 1)
                            ?.apply()
                    }
                    "Celsius" -> {
                        status = false
                        sharedPreferences?.edit()
                            ?.clear()
                            ?.apply()
                    }
                }
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.frameLayout, CurrentWeatherFragment(status))?.commit()
            }
            .setNegativeButton("Cancel") { dialog, which ->
                dialog.dismiss()
            }
            .show()
    }

}