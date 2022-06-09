package com.example.beerbooozie.ui.BeerDiscover

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beerbooozie.api.models.Beer
import com.example.beerbooozie.data.BeersRepo
import kotlinx.coroutines.launch

class BeerDiscoverViewModel: ViewModel() {

    private val _discoverBeer = MutableLiveData<List<Beer>>()

    val discoverBeer: LiveData<List<Beer>> = _discoverBeer

    fun makeAPICall()=viewModelScope.launch{

        BeersRepo.getDiscoverBeers().let {
            _discoverBeer.postValue(it.body())
        }
    }

}
