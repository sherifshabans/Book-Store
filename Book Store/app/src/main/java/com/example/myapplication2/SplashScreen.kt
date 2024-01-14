package com.example.myapplication2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val timer = object  : CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {
            }
            override fun onFinish() {

//                val intent= Intent(this@SplashScreen,LoginScreen::class.java)

                    val intent= Intent(this@SplashScreen,LoginScreen::class.java)
                    startActivity(intent)


            }
        }
       timer.start()
    }


}