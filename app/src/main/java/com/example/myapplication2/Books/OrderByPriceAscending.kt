package com.example.myapplication2.Books

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.modelOfBook.BookItem
import com.example.myapplication2.remote.RetroBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class OrderByPriceAscending : AppCompatActivity() {

    lateinit var bookAdabter: BookAdabter
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_by_price_ascending)
        getMyData()

    }

    @SuppressLint("SuspiciousIndentation")
    private fun getMyData() {
        val response = RetroBuilder.retrofit.getAllBookOrderByPriceAscending()

        response.enqueue(object : Callback<List<BookItem>> {
            override fun onResponse(
                call: Call<List<BookItem>>,
                response: Response<List<BookItem>>,
            ) {

                val recyclerView = findViewById<RecyclerView>(R.id.RecycleViewOfTopBook)
                val responseBody = response.body()!!
                Log.i("message","msg ${responseBody}")

                bookAdabter = BookAdabter(baseContext, responseBody!!,::onItemClick)
                recyclerView.layoutManager = GridLayoutManager(this@OrderByPriceAscending, 2)
                recyclerView.adapter = bookAdabter
                //        Toast.makeText(this@TopBookShow ,"$responseBody",Toast.LENGTH_LONG ).show()


            }

            override fun onFailure(call: Call<List<BookItem>?>, t: Throwable) {
                Toast.makeText(this@OrderByPriceAscending,
                    "SomeThing Went wrong ${t.message}",
                    Toast.LENGTH_LONG).show()

            }
        }
        )


    }
    private fun onItemClick(item: BookItem){
        val intent= Intent(this,Book_details::class.java)
        intent.putExtra("id",item.id)
        startActivity(intent)

    }
}







