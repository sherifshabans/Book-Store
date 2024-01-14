package com.example.myapplication2.book

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URl ="http://mariamtarek5999-001-site1.ftempurl.com/BOOK/";
class TopBookShow : AppCompatActivity() {
    lateinit var bookAdabter: BookAdabter
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_book_show)
        getMyData()

    }
    @SuppressLint("SuspiciousIndentation")
    private fun getMyData () {
        val okHttpClient= OkHttpClient.Builder().build()
        val retrofit= Retrofit.Builder()
            .baseUrl(BASE_URl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(BookServices::class.java)

    val retrofitData =retrofit.getTop10Book()

        retrofitData.enqueue(object  : Callback<List<AllDataBookItem>>{
            override fun onResponse(call: Call<List<AllDataBookItem>>,
                                    response: Response<List<AllDataBookItem>>, )
            {
                val recyclerView = findViewById<RecyclerView>(R.id.RecycleViewOfTopBook)
                val responseBody = response.body()!!
                bookAdabter = BookAdabter(baseContext, responseBody)
                 recyclerView.layoutManager = GridLayoutManager(this@TopBookShow, 2)
                recyclerView.adapter = bookAdabter
         Toast.makeText(this@TopBookShow ,"$responseBody",Toast.LENGTH_LONG ).show()
            }

            override fun onFailure(call: Call<List<AllDataBookItem>?>, t: Throwable) {
                Toast.makeText(this@TopBookShow,"SomeThing Went wrong $ {response.message()}",Toast.LENGTH_LONG ).show()

            }
        }
        )

    }

}





