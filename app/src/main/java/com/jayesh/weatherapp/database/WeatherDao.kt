package com.jayesh.weatherapp.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WeatherDao {

    @Insert
    fun insertWeather(weatherEntity: WeatherEntity)

    @Delete
    fun deleteWeather(weatherEntity: WeatherEntity)

    @Query("SELECT * FROM weatherhistory")
    fun getAllWeather(): List<WeatherEntity>

    @Query("SELECT * FROM weatherhistory WHERE city = :city")
    fun getWeatherById(city: String): WeatherEntity


}