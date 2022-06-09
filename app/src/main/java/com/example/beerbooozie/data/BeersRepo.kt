package com.example.beerbooozie.data

import com.example.beerbooozie.api.PunkClient

object BeersRepo {
    val api=PunkClient().api

    suspend fun getDiscoverBeers()= api.getBeers()

//    suspend fun getBeerDetails(ids:Int)=api.getBeerDetails(ids)
}