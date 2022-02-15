package com.jayesh.weatherapp.fragment

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.google.android.material.appbar.MaterialToolbar
import com.jayesh.weatherapp.R
import com.jayesh.weatherapp.adapter.WeatherAdapter
import com.jayesh.weatherapp.database.WeatherDatabase
import com.jayesh.weatherapp.database.WeatherEntity
import com.jayesh.weatherapp.model.Weather


class HistoryFragment : Fragment() {
    lateinit var mToolbar: MaterialToolbar
    lateinit var recyclerWeather: RecyclerView
    lateinit var weatherAdapter: WeatherAdapter
    lateinit var rlHistory: RelativeLayout
    private var historyList = arrayListOf<Weather>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        rlHistory = view.findViewById(R.id.rlHistory)
        recyclerWeather = view.findViewById(R.id.recyclerWeather)
        mToolbar = view.findViewById(R.id.mToolbar)

        mToolbar.setNavigationOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.frameLayout, CurrentWeatherFragment(false))
                ?.commit()
        }
        setUpRecyclerView(view)
        return view
    }

    private fun setUpRecyclerView(view: View?) {
        val backgroundList = weatherAsync(activity as Context).execute().get()

        if (backgroundList.isEmpty()) {
            val temp = true
        } else {
            for (i in backgroundList) {
                historyList.add(
                    Weather(
                        i.city,
                        i.temp,
                        i.minTemp,
                        i.maxTemp,
                        i.pressure,
                        i.humidity,
                        i.wind,
                        i.visibility
                    )
                )
            }

            weatherAdapter = WeatherAdapter(activity as Context, historyList)

            val mLayoutManager = LinearLayoutManager(activity)
            recyclerWeather.layoutManager = mLayoutManager
            recyclerWeather.itemAnimator = DefaultItemAnimator()
            recyclerWeather.adapter = weatherAdapter
            recyclerWeather.setHasFixedSize(true)
        }

    }

    class weatherAsync(context: Context) : AsyncTask<Void, Void, List<WeatherEntity>>() {
        val db = Room.databaseBuilder(context, WeatherDatabase::class.java, "weather").build()

        override fun doInBackground(vararg params: Void?): List<WeatherEntity> {
            return db.weatherDao().getAllWeather()
        }

    }


}