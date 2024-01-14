package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SignUpPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
/*val value=intent.getStringExtra(data)
val datashow=findViewById<TextView>(R.id.\)
        datashow.text=value
   */}
    fun signUpclick (signup: View){
        val signUpPass:EditText =findViewById(R.id.passidsignup)
        val passidsignup1:String=signUpPass.text.toString()

        val signUpname:EditText =findViewById(R.id.nameidsignup)
        val nameidsignup1:String=signUpname.text.toString()

        val signUpemail:EditText =findViewById(R.id.emailidsignup)
        val emailidsignup1:String=signUpemail.text.toString()

    val wrongSignUpPass :TextView=findViewById(R.id.passwrongsignup)
    val wrongSignUpName:TextView=findViewById(R.id.wrongnameidsingup)
    val wrongSignUpEmail:TextView =findViewById(R.id.emailwrongsignup)

        if(nameidsignup1.length<5){
            wrongSignUpName.visibility= View.VISIBLE

        }else {

            wrongSignUpName.visibility= View.INVISIBLE

        }
        if(!emailidsignup1.contains('@' ))
        {
            wrongSignUpEmail.visibility= View.VISIBLE

        }else {
            wrongSignUpEmail.visibility= View.INVISIBLE

        }
        if(passidsignup1.length<5){
            wrongSignUpPass.visibility= View.VISIBLE

        }else {
            wrongSignUpPass.visibility= View.INVISIBLE

        }



    }
}