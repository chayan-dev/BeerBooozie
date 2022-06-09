package com.example.beerbooozie.api

import com.example.beerbooozie.api.models.Beer
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PunkAPI {

    @GET("beers")
    suspend fun getBeers(
        @Query("ids") ids:Int?=null
    ): Response<List<Beer>>

//    @GET("beers")
//    suspend fun getBeerDetails(
//        @Query("ids") ids:Int?=null
//    ) : Response<Beer>
}