package com.example.examinationassignment.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private var service: RetrofitService? = null

    fun getService(): RetrofitService? {
        if (service == null)
            service =
                buildRetrofit()
        return service
    }

    private fun buildRetrofit(): RetrofitService? {
        return Retrofit.Builder()
            .baseUrl("https://gorest.co.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitService::class.java)



    }
}