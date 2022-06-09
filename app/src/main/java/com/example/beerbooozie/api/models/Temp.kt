package com.example.beerbooozie.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Temp(
    @Json(name = "unit")
    val unit: String,
    @Json(name = "value")
    val value: Double
)