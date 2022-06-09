package com.example.beerbooozie.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Fermentation(
    @Json(name = "temp")
    val temp: Temp
)