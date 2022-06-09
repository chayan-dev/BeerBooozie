package com.example.beerbooozie.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beerbooozie.api.models.Beer
import com.example.beerbooozie.data.BeersRepo
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BeerViewModel: ViewModel() {

    private val _discoverBeer = MutableLiveData<List<Beer>>()

    val discoverBeer: LiveData<List<Beer>> = _discoverBeer

    fun makeAPICall()=viewModelScope.launch{

        BeersRepo.getDiscoverBeers().let {
            _discoverBeer.postValue(it.body())
        }
    }

}
