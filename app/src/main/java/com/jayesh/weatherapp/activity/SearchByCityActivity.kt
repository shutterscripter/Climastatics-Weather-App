package com.jayesh.weatherapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.*
import androidx.appcompat.widget.Toolbar
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.appbar.AppBarLayout
import com.jayesh.weatherapp.R
import org.json.JSONObject
import kotlin.math.ceil

class SearchByCityActivity : AppCompatActivity() {

    lateinit var appbar: AppBarLayout
    lateinit var toolbar: Toolbar
    lateinit var etSearch: EditText

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
    lateinit var txtInfoTime: TextView
    lateinit var progressBarLayout: RelativeLayout
    lateinit var progressBar: ProgressBar
    lateinit var llMainLayout:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_by_city)

        appbar = findViewById(R.id.appbar)
        toolbar = findViewById(R.id.toolbar)
        etSearch = findViewById(R.id.etSearch)

        /*binding val to view ID*/
        txtCity = findViewById(R.id.txtCity)
        txtTemperature = findViewById(R.id.txtTemperature)
        txtWeatherInfo = findViewById(R.id.txtWeatherInfo)
        txtMinTemp = findViewById(R.id.txtMinTemp)
        txtMaxTemp = findViewById(R.id.txtMaxTemp)
        txtPressure = findViewById(R.id.txtPressure)
        txtHumidity = findViewById(R.id.txtHumidity)
        txtWind = findViewById(R.id.txtWind)
        txtVisibility = findViewById(R.id.txtVisibility)
        txtFeelsLike = findViewById(R.id.txtFeelsLike)
        txtInfoTime = findViewById(R.id.txtInfoTime)
        progressBarLayout = findViewById(R.id.progressBarLayout)
        progressBar = findViewById(R.id.progressBar)
        llMainLayout = findViewById(R.id.llMainLayout)

        setUpToolbar()

        getJson(etSearch)
    }



    private fun setUpToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Search Weather"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun getJson(etSearch: EditText) {
        val APIid = "426018c75093975f41a162f60caa80ed"
        val tCity = "pune"
        val queue = Volley.newRequestQueue(this)
        val url = "https://api.openweathermap.org/data/2.5/weather?q=${tCity}&appid=${APIid}"

        val jsonRequest = JsonObjectRequest(

            Request.Method.GET,
            url,
            null,
            Response.Listener { response ->

//                progressBarLayout.visibility =View.GONE
//                progressBar.visibility =View.GONE
//                llMainLayout.visibility =View.VISIBLE

//                Toast.makeText(this, "${response}", Toast.LENGTH_LONG).show()

                setValues(response)

            },
            Response.ErrorListener { Toast.makeText(this, "Something went wrong try again!", Toast.LENGTH_LONG).show() }
        )
        queue.add(jsonRequest)
    }

    private fun setValues(response: JSONObject?) {
        txtCity.text = response!!.getString("name")

        var feelLike = response?.getJSONObject("main")?.getString("feels_like")
        feelLike = ((((feelLike)!!.toFloat() - 273.15).toInt()).toString())
        txtFeelsLike.text = "Feels like ${feelLike}ºC"

        var weatherInfo = response?.getJSONArray("weather")?.getJSONObject(0)?.getString("main")
        txtWeatherInfo.text = weatherInfo
        txtInfoTime.text = weatherInfo

        var tempt = response?.getJSONObject("main")?.getString("temp")
        tempt = ((((tempt)!!.toFloat() - 273.15).toInt()).toString())
        txtTemperature?.text = "${tempt}ºC"

        var minTempt = response?.getJSONObject("main")?.getString("temp_min")
        minTempt = ((((minTempt)!!.toFloat() - 273.15).toInt()).toString())
        txtMinTemp.text = "${minTempt}ºC"

        var maxTempt = response?.getJSONObject("main")!!.getString("temp_max")
        maxTempt = ((ceil((maxTempt).toFloat() - 273.15).toInt()).toString())
        txtMaxTemp.text = "${maxTempt}ºC"

        txtPressure.text = response.getJSONObject("main").getString("pressure") + " hpa"

        txtHumidity.text = response.getJSONObject("main").getString("humidity") + "%"

        txtWind.text = response.getJSONObject("wind").getString("speed") + " m/s"

        txtVisibility.text = response.getString("visibility") + " km"



    }

    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                var intent = Intent(this,SplashScreen::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }*/
}