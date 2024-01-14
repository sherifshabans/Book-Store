package com.example.myapplication2.Books
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.modelOfBook.BookItem
import com.squareup.picasso.Picasso


class BookAdabter(baseContext: Context, val listOfData: List<BookItem>,val onClickItem:(BookItem)->Unit):
    RecyclerView.Adapter<BookAdabter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var bookTitleView: TextView
        var bookPriceView: TextView
        var bookImageView: ImageView
        var cardView:CardView
        init {
            bookTitleView = itemView.findViewById(R.id.BookNameID)
            bookPriceView = itemView.findViewById(R.id.BookPreiceID)
            bookImageView=itemView.findViewById(R.id.BookImageID)
          cardView =itemView.findViewById(R.id.bookIdCard)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.iteamtopbooks ,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = listOfData.get(position)

        holder.bookTitleView.text=   book.title
        holder.bookPriceView.text= book.price.toString()
        //    holder.authorNameView.text=book.author
        // holder.bookDetailView.text=book.details
        Picasso.get().load( "http://mariamtarek0605-001-site1.atempurl.com/${book.bookImage}").into(holder.bookImageView)
        Log.i( "2","$book")


        holder.bookImageView.setOnClickListener { onClickItem(book) }

    }

    override fun getItemCount(): Int {
        return listOfData.size
    }

}
