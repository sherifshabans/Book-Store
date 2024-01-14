package com.example.myapplication2.remote;

import com.example.myapplication2.modelOfAuthor.AuthorItem;
import com.example.myapplication2.modelOfBook.BookItem;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'\u00a8\u0006\u0014"}, d2 = {"Lcom/example/myapplication2/remote/ApiServices;", "", "getAllAuthor", "Lretrofit2/Call;", "", "Lcom/example/myapplication2/modelOfAuthor/AuthorItem;", "getAllBook", "Lcom/example/myapplication2/modelOfBook/BookItem;", "getAllBookOrderByDate", "getAllBookOrderByPriceAscending", "getAllBookOrderByPriceDescending", "getBook", "id", "", "getTop10Author", "getTop10Book", "uploadImage", "Lokhttp3/ResponseBody;", "file", "Lokhttp3/MultipartBody$Part;", "app_debug"})
public abstract interface ApiServices {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = " Author/top10Author")
    public abstract retrofit2.Call<java.util.List<com.example.myapplication2.modelOfAuthor.AuthorItem>> getTop10Author();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = " Author/getAll_Author")
    public abstract retrofit2.Call<java.util.List<com.example.myapplication2.modelOfAuthor.AuthorItem>> getAllAuthor();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "BOOK/top10Book")
    public abstract retrofit2.Call<java.util.List<com.example.myapplication2.modelOfBook.BookItem>> getTop10Book();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "BOOK/getAll_Book")
    public abstract retrofit2.Call<java.util.List<com.example.myapplication2.modelOfBook.BookItem>> getAllBook();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "BOOK/OrderBookByDate")
    public abstract retrofit2.Call<java.util.List<com.example.myapplication2.modelOfBook.BookItem>> getAllBookOrderByDate();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "BOOK/OrderByPriceDescending")
    public abstract retrofit2.Call<java.util.List<com.example.myapplication2.modelOfBook.BookItem>> getAllBookOrderByPriceDescending();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "BOOK/ OrderByPriceAscending")
    public abstract retrofit2.Call<java.util.List<com.example.myapplication2.modelOfBook.BookItem>> getAllBookOrderByPriceAscending();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "BOOK/Get_Book")
    public abstract retrofit2.Call<com.example.myapplication2.modelOfBook.BookItem> getBook(@retrofit2.http.Query(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Joint_Operations/Add_image")
    @retrofit2.http.Multipart()
    public abstract retrofit2.Call<okhttp3.ResponseBody> uploadImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part file);
}