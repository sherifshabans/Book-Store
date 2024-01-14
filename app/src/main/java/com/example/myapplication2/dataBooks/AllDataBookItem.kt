package com.example.myapplication2.dataBooks

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class AllDataBookItem(

@PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    val id :Int,
    @SerializedName("title")
    val title :String,
    @SerializedName("price")
    val price :String,
    @SerializedName("qty")
    val qty :String,
    @SerializedName("details")
    val  details : String,
    @SerializedName("bookImage")
    val  bookImage : String,
 @SerializedName("authorId")
    val  authorId  : Int,
 @SerializedName("author")
    val  author  : String,
@SerializedName("categoryId")
    val  categoryId   : Int,
@SerializedName("shoppingBasket_Books")
    val  shoppingBasket_Books   : Int,
@SerializedName("comments")
    val  comments   : String,


    )
/*"id": 4,
        "title": "لا مكان للملل",
        "date": "2023-02-07T19:01:47.834",
        "price": 80,
        "qty": 80,
        "details": "\nأحيانًا يتكلم بطل القصة بغرور أو وقاحة أو يكون ملحدًا.. يقوم الأدمن بنقل الجملة كما هي من على لسان البطل ويكتب اسمي جوارها! هكذا تجد لي عبارات خالدة مثل: “يجب قهر الضعفاء – أحمد خالد” أو “إنني أقدم للأجيال القادمة قطوف الحكمة التي لن يجدوها في أي موضع آخر – أحمد خالد” أو” من الواضح تمامًا أن الكون أوجد نفسه بلا حاجة لخالق – أحمد خالد. \n",
        "bookImage": "Images/63811364493545479943455970._SX318_.jpg",
        "authorId": 1,
        "categoryId": 2,
        "category": null,
        "shoppingBasket_Books": null,
        "comments": null*/