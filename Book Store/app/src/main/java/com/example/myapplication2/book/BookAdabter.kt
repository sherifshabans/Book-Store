package com.example.myapplication2.book
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.squareup.picasso.Picasso


class BookAdabter(baseContext: Context, val listOfData: List<AllDataBookItem>):
    RecyclerView.Adapter<BookAdabter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          var bookTitleView: TextView
          var bookPriceView: TextView
          var bookImageView: ImageView

        init {
            bookTitleView = itemView.findViewById(R.id.BookNameID)
            bookPriceView = itemView.findViewById(R.id.BookPreiceID)
            bookImageView=itemView.findViewById(R.id.BookImageID)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.iteamtopbooks ,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = listOfData[position]
        holder.bookTitleView.text=book.title
        holder.bookPriceView.text= book.price
        Picasso.get().load("http://mariamtarek5999-001-site1.ftempurl.com/${book.bookImage}").into(holder.bookImageView)
        Log.i( "2","$book")

    }

    override fun getItemCount(): Int {
        return listOfData.size
    }
}

