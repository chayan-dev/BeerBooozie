package com.example.beerbooozie.ui.BeerDetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beerbooozie.api.models.Beer
import com.example.beerbooozie.data.BeersRepo.api
import kotlinx.coroutines.launch

class BeerDetailsViewModel:ViewModel() {

    private val _beer= MutableLiveData<Beer>()

    val beer:LiveData<Beer> = _beer

    fun fetchBeerDetails(ids: Int)= viewModelScope.launch {

        api.getBeers(ids).let {
            _beer.postValue(it.body()?.get(0))
        }
    }
}