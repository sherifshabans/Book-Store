package com.example.myapplication2.remote

import com.example.myapplication2.modelOfAuthor.AuthorItem
import com.example.myapplication2.modelOfBook.BookItem
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ApiServices {

    @GET(" Author/top10Author")
    fun getTop10Author(): Call<List<AuthorItem>>
    @GET(" Author/getAll_Author")
    fun getAllAuthor(): Call<List<AuthorItem>>
    @GET("BOOK/top10Book")
    fun getTop10Book(): Call<List<BookItem>>
    @GET("BOOK/getAll_Book")
    fun getAllBook(): Call<List<BookItem>>
    @GET("BOOK/OrderBookByDate")
    fun getAllBookOrderByDate(): Call<List<BookItem>>
    @GET("BOOK/OrderByPriceDescending")
    fun getAllBookOrderByPriceDescending(): Call<List<BookItem>>
    @GET("BOOK/ OrderByPriceAscending")
    fun getAllBookOrderByPriceAscending(): Call<List<BookItem>>
    @GET("BOOK/Get_Book")
    fun getBook(@Query("id") id: Int): Call<BookItem>

    @Multipart
    @POST("Joint_Operations/Add_image")
     fun uploadImage(@Part file:MultipartBody.Part):Call<ResponseBody>
//http://mariamtarek0605-001-site1.atempurl.com/Joint_Operations/Add_image



















}