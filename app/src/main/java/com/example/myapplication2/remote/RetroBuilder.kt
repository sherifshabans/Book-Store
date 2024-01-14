package com.example.myapplication2.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroBuilder {
       const val BASE_URl ="http://mariamtarek0605-001-site1.atempurl.com/"


    val retrofit:ApiServices by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiServices::class.java)

    }
}