package com.example.myapplication2

import com.google.gson.annotations.SerializedName

data class CreateOrderBody(

@SerializedName("name")
val name:String,
@SerializedName("authorImage")
val authorImage:String

)

/*{
  "name": "string",
  "authorImage": "string"
}
* */