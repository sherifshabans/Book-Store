package com.example.myapplication2.Authors

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.modelOfAuthor.AuthorItem
import com.example.myapplication2.remote.RetroBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class allAuthor : AppCompatActivity() {
    lateinit var authorAdabter: AuthorAdabter
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_author)
        getMyData()
    }
    private fun getMyData() {
        val response = RetroBuilder.retrofit.getAllAuthor()
        response.enqueue(object : Callback<List<AuthorItem>> {
            override fun onResponse(
                call: Call<List<AuthorItem>>,
                response: Response<List<AuthorItem>>,
            ) {
                val recyclerView = findViewById<RecyclerView>(R.id.RecycleViewOfTopAuthor)
                val responseBody = response.body()!!
                authorAdabter = AuthorAdabter(baseContext, responseBody)
                recyclerView.layoutManager = GridLayoutManager(this@allAuthor, 2)
                recyclerView.adapter = authorAdabter

                //       Toast.makeText(this@TopBookShow ,"$responseBody",Toast.LENGTH_LONG ).show()
            }
            override fun onFailure(call: Call<List<AuthorItem>?>, t: Throwable) {
                Toast.makeText(this@allAuthor,"SomeThing Went wrong $ {response.message()}",
                    Toast.LENGTH_LONG ).show()

            }

        })
    }

}