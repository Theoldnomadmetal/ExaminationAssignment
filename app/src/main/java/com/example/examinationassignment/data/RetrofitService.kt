package com.example.examinationassignment.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("public-api/products")
    fun getProductList(@Query("page") page:Int): Call<ResponseBase>
}