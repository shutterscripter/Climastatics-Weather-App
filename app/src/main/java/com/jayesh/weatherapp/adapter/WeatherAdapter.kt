package com.jayesh.weatherapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jayesh.weatherapp.R
import com.jayesh.weatherapp.model.Weather
import org.w3c.dom.Text
import kotlin.math.ceil

class WeatherAdapter(val context: Context, val itemList: ArrayList<Weather>) :
    RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {

    class WeatherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtTemperature: TextView = view.findViewById(R.id.txtTemperature)
        val txtCity: TextView = view.findViewById(R.id.txtCity)
        val txtMinTemp: TextView = view.findViewById(R.id.txtMinTemp)
        val txtMaxTemp: TextView = view.findViewById(R.id.txtMaxTemp)
        val txtWind: TextView = view.findViewById(R.id.txtWind)
        val txtVisibility: TextView = view.findViewById(R.id.txtVisibility)
        val txtHumidity: TextView = view.findViewById(R.id.txtHumidity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.history_item, parent, false)
        return WeatherViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val history = itemList[position]

        var tempt = history.temp
        tempt = ((((tempt)!!.toFloat() - 273.15).toInt()).toString())
        holder.txtTemperature.text = tempt + "ºC"

        holder.txtCity.text = history.city

        var minTempt = history.minTemp
        minTempt = ((((minTempt)!!.toFloat() - 273.15).toInt()).toString())
        holder.txtMinTemp.text = "Min: " + minTempt + "ºC"

        var maxTempt = history.maxTemp
        maxTempt = ((ceil((maxTempt).toFloat() - 273.15).toInt()).toString())
        holder.txtMaxTemp.text = "Max: " + maxTempt + "ºC"


        holder.txtWind.text = "wind: " + history.wind + " m/s"

        holder.txtVisibility.text = "Visibility: " + history.visibility + " km"

        holder.txtHumidity.text = "Humidity: " + history.humidity + "%"
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}