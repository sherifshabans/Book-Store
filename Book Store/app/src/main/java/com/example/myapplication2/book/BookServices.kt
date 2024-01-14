package com.example.myapplication2.book

import retrofit2.Call
import retrofit2.http.GET

interface BookServices {

    @GET("top10Book")
    fun getTop10Book(): Call<List<AllDataBookItem>>

}