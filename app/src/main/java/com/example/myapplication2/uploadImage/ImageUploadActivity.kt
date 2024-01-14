/*

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2.R
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.io.File
import java.io.IOException

class ImageUploadActivity : AppCompatActivity() {

    private lateinit var selectImageButton: Button
    private var selectedImageUri: Uri? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_upload)

        selectImageButton = findViewById(R.id.select_image_button)
        selectImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            selectedImageUri = data.data
            uploadSelectedImage()
        }
    }

    private fun uploadSelectedImage() {
        val selectedImageUri = selectedImageUri ?: return
        val selectedImageFile = File(getRealPathFromURI(selectedImageUri) ?: return)
        val client = OkHttpClient()
        val requestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart(
                "file", selectedImageFile.name,
                RequestBody.create("image/*".toMediaTypeOrNull(), selectedImageFile)
            )
            .build()
        val request = Request.Builder()
            .url("http://mariamtarek0605-001-site1.atempurl.com/Joint_Operations/Add_image\n")
            .post(requestBody)
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                // Handle upload failure
            }

            override fun onResponse(call: Call, response: Response) {
                val responseBody = response!!.body?.string()
                Toast.makeText(this@ImageUploadActivity,"${responseBody}" ,Toast.LENGTH_LONG ).show()
                // Handle upload success
            }
        })
    }

    private fun getRealPathFromURI(uri: Uri): String? {
        val projection = arrayOf(MediaStore.Images.Media.DATA)
        val cursor = contentResolver.query(uri, projection, null, null, null)
        val columnIndex = cursor?.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
        cursor?.moveToFirst()
        val filePath = columnIndex?.let { cursor.getString(it) }
        cursor?.close()
        return filePath
    }
}*/