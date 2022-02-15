package com.jayesh.weatherapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "WeatherHistory")
data class WeatherEntity(

    @PrimaryKey val city: String,
    @ColumnInfo(name = "temp") val temp: String,
    @ColumnInfo(name = "min_temp") val minTemp: String,
    @ColumnInfo(name = "max_temp") val maxTemp: String,
    @ColumnInfo(name = "pressure") val pressure: String,
    @ColumnInfo(name = "humidity") val humidity: String,
    @ColumnInfo(name = "wind") val wind: String,
    @ColumnInfo(name = "visibility") val visibility: String
)
