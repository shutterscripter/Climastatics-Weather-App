package com.jayesh.weatherapp.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.appbar.MaterialToolbar
import com.jayesh.weatherapp.R
import com.jayesh.weatherapp.activity.MainActivity


class AboutFragment : Fragment() {
    lateinit var mToolbar: MaterialToolbar
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        mToolbar = view.findViewById(R.id.mToolbar)

        mToolbar.setNavigationOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.frameLayout, SettingsFragment())
                ?.commit()
        }
        return view
    }
}