package com.sametcetinkaya.countrieskotlin.service

import com.sametcetinkaya.countrieskotlin.model.Country
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CountryApiService {

    private val BASE_URL = "https://raw.githubusercontent.com/"
    private val retrofitApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(CountryAPI::class.java)

    fun getCountryData() :Single<List<Country>> {
        return retrofitApi.getCountries()
    }
}