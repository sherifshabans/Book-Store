package com.example.myapplication2

import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import java.io.File

interface BookInterfaceApi


/*
     val file = File("selected file")
    val requestFile: RequestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file)
    val imageBody: MultipartBody.Part = MultipartBody.Part.createFormData("file", file.getName(), requestFile)
    @Multipart
    @POST("dashboard/media")
    suspend fun upload(@Part file: MultipartBody.Part): UploadMediaResponse
*/
