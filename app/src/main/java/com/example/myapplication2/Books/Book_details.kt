package com.example.myapplication2.Books

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.modelOfBook.BookItem
import com.example.myapplication2.remote.RetroBuilder
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Book_details : AppCompatActivity() {

    lateinit var bookAdabterdetails: BookDeatilsAdabter
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView
    private var id: Int =1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)
       id=intent.getIntExtra("id",1)
        getMyData(id)
    }
    private fun getMyData(id:Int) {
        val response = RetroBuilder.retrofit.getBook(id)

        response.enqueue(object : Callback<BookItem> {
            override fun onResponse(call: Call<BookItem>, response: Response<BookItem>, ) {

                val recyclerView = findViewById<RecyclerView>(R.id.RecycleViewOfTopBook)
                val responseBody = response.body()!!
              if(response.isSuccessful )
                Log.i("message","msg ${responseBody}")

                val bookDetails=findViewById<TextView>(R.id.detailsID)
                bookDetails.text=responseBody.details
                val bookprice=findViewById<TextView>(R.id.deatilprice)
                bookprice.text=responseBody.price.toString()
               val photo = findViewById<ImageView>(R.id.deatilimageId)
                Picasso.get().load( "http://mariamtarek0605-001-site1.atempurl.com/${responseBody.bookImage}").into(photo)
                val name =findViewById<TextView>(R.id.titleBookId)
                name.text=responseBody.title


                bookAdabterdetails = BookDeatilsAdabter(baseContext,responseBody!!)



            //              recyclerView.layoutManager = GridLayoutManager(this@Book_details, 1)
            //                recyclerView.adapter = bookAdabter
            //        Toast.makeText(this@TopBookShow ,"$responseBody",Toast.LENGTH_LONG ).show()
            }
            override fun onFailure(call: Call<BookItem>, t: Throwable) {
                Toast.makeText(this@Book_details,
                    "SomeThing Went wrong ${t.message}",
                    Toast.LENGTH_LONG).show()
            }
        })


    }
}