package com.example.beerbooozie.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MashTemp(
    @Json(name = "duration")
    val duration: Int?,
    @Json(name = "temp")
    val temp: Temp
)