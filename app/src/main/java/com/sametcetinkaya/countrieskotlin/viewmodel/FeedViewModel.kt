package com.sametcetinkaya.countrieskotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sametcetinkaya.countrieskotlin.model.Country

class FeedViewModel : ViewModel() {
    val countries = MutableLiveData<List<Country>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()

    fun refreshData() {

        val country = Country("Turkey","Asia", "Ankara", "TRY","Turkish","www.ss.com")
        val country2 = Country("Germany","Europe", "Paris", "EUR","French","www.ss.com")
        val country3 = Country("France","Europe", "Berlin", "EUR","German","www.ss.com")

        val countryList = arrayListOf<Country>(country,country2,country3)

        countries.value = countryList
        countryError.value = false
        countryLoading.value = false
    }
}