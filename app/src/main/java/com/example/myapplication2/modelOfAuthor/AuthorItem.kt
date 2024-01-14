package com.example.myapplication2.modelOfAuthor

data class AuthorItem(
    val authorImage: String,
    val books: List<Book>,
    val id: Int,
    val name: String
)