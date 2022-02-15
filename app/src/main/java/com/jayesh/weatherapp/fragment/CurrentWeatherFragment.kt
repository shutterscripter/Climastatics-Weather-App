package com.jayesh.weatherapp.fragment

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.SharedValues
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.appbar.MaterialToolbar
import com.jayesh.weatherapp.R
import org.json.JSONObject
import org.w3c.dom.Text
import kotlin.math.ceil


class CurrentWeatherFragment(var status: Boolean) : Fragment() {
    lateinit var mToolbar: MaterialToolbar
    lateinit var txtTemperature: TextView
    lateinit var txtWeatherInfo: TextView
    lateinit var txtMinTemp: TextView
    lateinit var txtMaxTemp: TextView
    lateinit var txtPressure: TextView
    lateinit var txtHumidity: TextView
    lateinit var txtWind: TextView
    lateinit var txtVisibility: TextView
    lateinit var txtCity: TextView
    lateinit var txtFeelsLike: TextView
    lateinit var progressBarLayout: RelativeLayout
    lateinit var progressBar: ProgressBar
    lateinit var llCurrentLayout: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_curent_weather, container, false)

        /*binding val to view ID*/
        txtCity = view.findViewById(R.id.txtCity)
        txtTemperature = view.findViewById(R.id.txtTemperature)
        txtWeatherInfo = view.findViewById(R.id.txtWeatherInfo)
        txtMinTemp = view.findViewById(R.id.txtMinTemp)
        txtMaxTemp = view.findViewById(R.id.txtMaxTemp)
        txtPressure = view.findViewById(R.id.txtPressure)
        txtHumidity = view.findViewById(R.id.txtHumidity)
        txtWind = view.findViewById(R.id.txtWind)
        txtVisibility = view.findViewById(R.id.txtVisibility)
        txtFeelsLike = view.findViewById(R.id.txtFeelsLike)
        llCurrentLayout = view.findViewById(R.id.llCurrentLayout)
        progressBarLayout = view.findViewById(R.id.progressBarLayout)
        progressBar = view.findViewById(R.id.progressBar)

        progressBarLayout.visibility = View.VISIBLE
        progressBar.visibility = View.VISIBLE

        val lat = activity?.intent?.getStringExtra("lat")
        val long = activity?.intent?.getStringExtra("long")

        getJson(lat, long)

        return view
    }

    private fun getJson(lat: String?, long: String?) {
        val APIid = "426018c75093975f41a162f60caa80ed"
        val queue = Volley.newRequestQueue(activity)
        val url =
            "https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${long}&appid=${APIid}"


        val jsonRequest = JsonObjectRequest(
            Request.Method.GET,
            url,
            null,
            Response.Listener { response ->
                progressBarLayout.visibility = View.GONE
                progressBar.visibility = View.GONE
                llCurrentLayout.visibility = View.VISIBLE

                setValues(response)
            },
            Response.ErrorListener {
                Toast.makeText(activity, "volley Error!", Toast.LENGTH_LONG).show()
            }
        )


        queue.add(jsonRequest)
    }

    @SuppressLint("SetTextI18n")
    private fun setValues(response: JSONObject?) {
        var feelLike = response?.getJSONObject("main")?.getString("feels_like")
        var tempt = response?.getJSONObject("main")?.getString("temp")
        var minTempt = response?.getJSONObject("main")?.getString("temp_min")
        var maxTempt = response?.getJSONObject("main")!!.getString("temp_max")

        val sharedPreferences: SharedPreferences? = activity
            ?.getSharedPreferences("status", Context.MODE_PRIVATE)

        val fSharedValues = sharedPreferences?.getInt("F", 0)
        val cSharedValues = sharedPreferences?.getInt("C", 1)
        if (fSharedValues == 1) {
            feelLike = ((((feelLike)!!.toFloat() * 9 / 5 - 459.67).toInt()).toString())
            txtFeelsLike.text = "Feels like ${feelLike}ºF"

            tempt = ((((tempt)!!.toFloat() * 9 / 5 - 459.67).toInt()).toString())
            txtTemperature?.text = "${tempt}ºF"

            minTempt = ((((minTempt)!!.toFloat() * 9 / 5 - 459.67).toInt()).toString())
            txtMinTemp.text = "${minTempt}ºF"

            maxTempt = ((((maxTempt)!!.toFloat() * 9 / 5 - 459.67).toInt()).toString())
            txtMaxTemp.text = "${maxTempt}ºF"

        } else {

            feelLike = ((((feelLike)!!.toFloat() - 273.15).toInt()).toString())
            txtFeelsLike.text = "Feels like ${feelLike}ºC"


            tempt = ((((tempt)!!.toFloat() - 273.15).toInt()).toString())
            txtTemperature?.text = "${tempt}ºC"

            minTempt = ((((minTempt)!!.toFloat() - 273.15).toInt()).toString())
            txtMinTemp.text = "${minTempt}ºC"

            maxTempt = ((ceil((maxTempt).toFloat() - 273.15).toInt()).toString())
            txtMaxTemp.text = "${maxTempt}ºC"
        }

        txtCity.text = response!!.getString("name")

        txtWeatherInfo.text = response?.getJSONArray("weather")?.getJSONObject(0)?.getString("main")

        txtPressure.text = response.getJSONObject("main").getString("pressure") + " hpa"

        txtHumidity.text = response.getJSONObject("main").getString("humidity") + "%"

        txtWind.text = response.getJSONObject("wind").getString("speed") + " m/s"

        txtVisibility.text = response.getString("visibility") + " km"


    }


}