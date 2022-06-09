package com.example.beerbooozie.ui.BeerDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.beerbooozie.R
import com.example.beerbooozie.databinding.FragmentBeerDetailsBinding
import com.example.beerbooozie.extensions.loadImage

class BeerDetailsFragment:Fragment() {

    private var binding :FragmentBeerDetailsBinding? = null
    lateinit var detailsViewModel: BeerDetailsViewModel

    private var beerId:Int ?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        detailsViewModel=ViewModelProvider(this).get(BeerDetailsViewModel::class.java)

        binding=FragmentBeerDetailsBinding.inflate(inflater,container,false)

        arguments?.let {
            beerId=it.getInt(resources.getString(R.string.arg_beer_id))
        }

        beerId?.let {
            detailsViewModel.fetchBeerDetails(it)
        }

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        detailsViewModel.beer.observe({lifecycle}){
            binding?.apply {
                (activity as AppCompatActivity).supportActionBar?.title = "${it.name}"

                beerImage.loadImage(it.imageUrl)
                beerName.text=it.name
                beerAbv.text=" ABV: ${it.abv.toString()}"
                beerDescp.text=it.description

//                val maltIngredients=it.ingredients.malt.joinToString {
//                    it.name.toString()
//                }
////                val hops =  it.ingredients.hops.joinToString {
////                    it.name.toString()
////                }
                val foodPairings = it.foodPairing.joinToString {
                    it.toString()
                }

                beerFoodPairing.text=foodPairings
//                beerDetails.text=foodPairings

            }
        }
    }
}