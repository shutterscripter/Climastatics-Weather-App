package com.jayesh.weatherapp.fragment

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.room.Room
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.appbar.MaterialToolbar
import com.jayesh.weatherapp.R
import com.jayesh.weatherapp.activity.MainActivity
import com.jayesh.weatherapp.activity.TempActivity
import com.jayesh.weatherapp.database.WeatherDatabase
import com.jayesh.weatherapp.database.WeatherEntity
import org.json.JSONObject
import kotlin.math.ceil


class SearchFragment : Fragment() {
    lateinit var mToolbar: MaterialToolbar
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
    lateinit var progressBarLayout: RelativeLayout
    lateinit var progressBar: ProgressBar
    lateinit var llMainLayout: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        etSearch = view.findViewById(R.id.etSearch)
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
        progressBarLayout = view.findViewById(R.id.progressBarLayout)
        progressBar = view.findViewById(R.id.progressBar)
        llMainLayout = view.findViewById(R.id.llMainLayout)
        mToolbar = view.findViewById(R.id.mToolbar)

        //navigation back button
        mToolbar.setNavigationOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.frameLayout, CurrentWeatherFragment(false))
                ?.commit()
        }


        etSearch.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                getData(etSearch.text.toString())

                progressBarLayout.visibility = View.VISIBLE
                progressBar.visibility = View.VISIBLE
                true
            } else {
                false
            }
        }



        return view
    }


    private fun getData(city: String) {

        val APIid = "426018c75093975f41a162f60caa80ed"
        val queue = Volley.newRequestQueue(activity)
        val url = "https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${APIid}"

        val jsonRequest = object : JsonObjectRequest(
            Request.Method.GET,
            url,
            null,
            Response.Listener { response ->

                progressBarLayout.visibility = View.GONE
                progressBar.visibility = View.GONE
                llMainLayout.visibility = View.VISIBLE

//                Toast.makeText(this, "${response}", Toast.LENGTH_LONG).show()

                setValues(response)
                //database work

                val listOfWeather = GetAllWeatherAsynctask(requireContext()).execute().get()

                if (listOfWeather.isNotEmpty()) {
                    Toast.makeText(activity, "added!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(activity, "Unable to add!", Toast.LENGTH_SHORT).show()
                }

                val weatherEntity = WeatherEntity(
                    response!!.getString("name"),
                    response?.getJSONObject("main")?.getString("temp").toString(),
                    response?.getJSONObject("main")?.getString("temp_min").toString(),
                    response?.getJSONObject("main")!!.getString("temp_max"),
                    response.getJSONObject("main").getString("pressure"),
                    response.getJSONObject("main").getString("humidity"),
                    response.getJSONObject("wind").getString("speed"),
                    response.getString("visibility")
                )

                if (!DBAsyncTask(requireContext(), weatherEntity, 1).execute().get()) {
                    val async = DBAsyncTask(requireContext(), weatherEntity, 2).execute()

                    val result = async.get()
                    if (result) {
                        Toast.makeText(activity, "2", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    val async = DBAsyncTask(requireContext(), weatherEntity, 3).execute()
                    val result = async.get()

                    if (result) {
                        Toast.makeText(activity, "3", Toast.LENGTH_SHORT).show()
                    }

                }
            },
            Response.ErrorListener {
                Toast.makeText(
                    activity,
                    "Something went wrong try again!",
                    Toast.LENGTH_LONG
                ).show()
            }
        ) {}
        queue.add(jsonRequest)
    }

    @SuppressLint("SetTextI18n")
    private fun setValues(response: JSONObject?) {
        var cityName = response!!.getString("name")
        txtCity.text = cityName

        var feelLike = response?.getJSONObject("main")?.getString("feels_like")
        feelLike = ((((feelLike)!!.toFloat() - 273.15).toInt()).toString())
        txtFeelsLike.text = "Feels like ${feelLike}ºC"

        var weatherInfo = response?.getJSONArray("weather")?.getJSONObject(0)?.getString("main")
        txtWeatherInfo.text = weatherInfo

        var tempt = response?.getJSONObject("main")?.getString("temp")
        tempt = ((((tempt)!!.toFloat() - 273.15).toInt()).toString())
        txtTemperature?.text = "${tempt}ºC"

        var minTempt = response?.getJSONObject("main")?.getString("temp_min")
        minTempt = ((((minTempt)!!.toFloat() - 273.15).toInt()).toString())
        txtMinTemp.text = "${minTempt}ºC"

        var maxTempt = response?.getJSONObject("main")!!.getString("temp_max")
        maxTempt = ((ceil((maxTempt).toFloat() - 273.15).toInt()).toString())
        txtMaxTemp.text = "${maxTempt}ºC"

        var pressure = response.getJSONObject("main").getString("pressure")
        txtPressure.text = "$pressure hpa"

        var humidity = response.getJSONObject("main").getString("humidity")
        txtHumidity.text = "$humidity %"

        var wind = response.getJSONObject("wind").getString("speed")
        txtWind.text = wind + " m/s"

        var visibility = response.getString("visibility")
        txtVisibility.text = visibility + " km"


    }

    /* private fun passText(city: String?) {
         val intent = Intent(activity, TempActivity::class.java)
         intent.putExtra("search", city)
         startActivity(intent)
     }*/

    //database class

    class DBAsyncTask(context: Context, val weatherEntity: WeatherEntity, val mode: Int) :
        AsyncTask<Void, Void, Boolean>() {

        val db = Room.databaseBuilder(context, WeatherDatabase::class.java, "weather").build()

        override fun doInBackground(vararg params: Void?): Boolean {
            /*
             Mode 1 -> Check DB if the book is favourite or not
             Mode 2 -> Save the book into DB as favourite
             Mode 3 -> Remove the favourite book
             */

            when (mode) {
                1 -> {
                    val wea: WeatherEntity? =
                        db.weatherDao().getWeatherById(weatherEntity.city)
                    db.close()
                    return wea != null
                }

                2 -> {
                    db.weatherDao().insertWeather(weatherEntity)
                    db.close()
                    return true
                }

                3 -> {
                    db.weatherDao().deleteWeather(weatherEntity)
                    db.close()
                    return true
                }
            }
            return false
        }

    }

    /*Since the outcome of the above background method is always a boolean, we cannot use the above here.
    * We require the list of favourite restaurants here and hence the outcome would be list.
    * For simplicity we obtain the list of restaurants and then extract their ids which is then compared to the ids
    * inside the list sent to the adapter */

    class GetAllWeatherAsynctask(
        context: Context
    ) :
        AsyncTask<Void, Void, List<String>>() {
        val db = Room.databaseBuilder(context, WeatherDatabase::class.java, "weather").build()

        override fun doInBackground(vararg params: Void?): List<String>? {
            val list = db.weatherDao().getAllWeather()
            val listOfIds = arrayListOf<String>()
            for (i in list) {
                listOfIds.add(i.city.toString())
            }
            return listOfIds

        }

    }


}