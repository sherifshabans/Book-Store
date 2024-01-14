package com.example.myapplication2.dataBooks

import com.google.gson.annotations.SerializedName

data class AllDataAutorItem(
    @SerializedName("id")
    val id :Int,
    @SerializedName("name")
    val name :String,
    @SerializedName("authorImage")
    val  authorImage : String,
    @SerializedName("books")
    val book : List<AllDataBookItem>

    )