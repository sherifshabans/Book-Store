package com.example.myapplication2.Books;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication2.R;
import com.example.myapplication2.modelOfBook.BookItem;
import com.squareup.picasso.Picasso;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/myapplication2/Books/BookDeatilsAdabter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myapplication2/Books/BookDeatilsAdabter$ViewHolder;", "baseContext", "Landroid/content/Context;", "listOfData", "Lcom/example/myapplication2/modelOfBook/BookItem;", "(Landroid/content/Context;Lcom/example/myapplication2/modelOfBook/BookItem;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class BookDeatilsAdabter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myapplication2.Books.BookDeatilsAdabter.ViewHolder> {
    private final com.example.myapplication2.modelOfBook.BookItem listOfData = null;
    
    public BookDeatilsAdabter(@org.jetbrains.annotations.NotNull()
    android.content.Context baseContext, @org.jetbrains.annotations.NotNull()
    com.example.myapplication2.modelOfBook.BookItem listOfData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myapplication2.Books.BookDeatilsAdabter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myapplication2.Books.BookDeatilsAdabter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/example/myapplication2/Books/BookDeatilsAdabter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bookDetailsView", "Landroid/widget/TextView;", "getBookDetailsView", "()Landroid/widget/TextView;", "setBookDetailsView", "(Landroid/widget/TextView;)V", "bookImagedetailsView", "Landroid/widget/ImageView;", "getBookImagedetailsView", "()Landroid/widget/ImageView;", "setBookImagedetailsView", "(Landroid/widget/ImageView;)V", "bookPricedetailsView", "getBookPricedetailsView", "setBookPricedetailsView", "bookTitledetailsView", "getBookTitledetailsView", "setBookTitledetailsView", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "setCardView", "(Landroidx/cardview/widget/CardView;)V", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView bookTitledetailsView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView bookPricedetailsView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView bookDetailsView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView bookImagedetailsView;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView cardView;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBookTitledetailsView() {
            return null;
        }
        
        public final void setBookTitledetailsView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBookPricedetailsView() {
            return null;
        }
        
        public final void setBookPricedetailsView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBookDetailsView() {
            return null;
        }
        
        public final void setBookDetailsView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getBookImagedetailsView() {
            return null;
        }
        
        public final void setBookImagedetailsView(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
        
        public final void setCardView(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
    }
}