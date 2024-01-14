package com.example.myapplication2.Authors
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.modelOfAuthor.AuthorItem
import com.squareup.picasso.Picasso


class AuthorAdabter(baseContext: Context, val listOfData: List<AuthorItem>):
    RecyclerView.Adapter<AuthorAdabter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var authorNameView: TextView

        var authorImageView: ImageView

        init {
            authorNameView = itemView.findViewById(R.id.AuthorNameID)
            authorImageView=itemView.findViewById(R.id.AuthorImageID)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.iteamtopauthors ,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = listOfData[position]
        holder.authorNameView.text= book.name
        Picasso.get().load(
            "http://mariamtarek0605-001-site1.atempurl.com/${book.authorImage}").into(holder.authorImageView)
        Log.i( "2","$book")

    }

    override fun getItemCount(): Int {
        return listOfData.size
    }
}

