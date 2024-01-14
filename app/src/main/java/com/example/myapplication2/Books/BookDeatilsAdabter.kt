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

class BookDeatilsAdabter(baseContext: Context, private val listOfData: BookItem)  :
 RecyclerView.Adapter<BookDeatilsAdabter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var bookTitledetailsView: TextView
        var bookPricedetailsView: TextView
        var bookDetailsView: TextView
        var bookImagedetailsView: ImageView
        var cardView: CardView
        init {
            bookTitledetailsView = itemView.findViewById(R.id.titleBookId)
            bookPricedetailsView = itemView.findViewById(R.id.deatilprice)
            bookImagedetailsView=itemView.findViewById(R.id.deatilimageId)
            bookDetailsView=itemView.findViewById(R.id.detailsID)
            cardView =itemView.findViewById(R.id.bookIdCard)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.activity_book_details,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = listOfData
        holder.bookTitledetailsView.text=   book.title
        holder.bookPricedetailsView.text= book.price.toString()
        //    holder.authorNameView.text=book.author
        holder.bookDetailsView.text=book.details
        Picasso.get().load( "http://mariamtarek0605-001-site1.atempurl.com/${book.bookImage}").into(holder.bookImagedetailsView)
        Log.i("1", "$book")
    }
    override fun getItemCount(): Int {
        return 1
    }
}