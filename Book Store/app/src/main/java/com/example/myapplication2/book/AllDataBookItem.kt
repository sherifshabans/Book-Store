package com.example.myapplication2.book

import com.google.gson.annotations.SerializedName

data class AllDataBookItem(
    @SerializedName("title")
    val title :String,
    @SerializedName("price")
    val price :String,
    @SerializedName("bookImage")
    val  bookImage :String,

    )