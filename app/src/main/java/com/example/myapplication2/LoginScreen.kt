package com.example.myapplication2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2.Books.TopBookShow


class LoginScreen : AppCompatActivity() {
   lateinit var  email1 :String
   lateinit var pass1:String
   lateinit var emailent:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val signup1 :TextView =findViewById(R.id.gotosignupid)
        signup1.setOnClickListener{
            //لو عايز اروح لأي مكان داخل الابليكيشن اديله انا واقف فين وعايز اروح فين
            val signUpIntent :Intent=Intent(this,SignUpPage ::class.java )
            startActivity(signUpIntent)
        }

        // islogin
        val button:Button = findViewById(R.id.loginid)

       button.setOnClickListener {    //  get referense
            val     emailent :EditText=findViewById(R.id.emailid)
            val  passent :EditText =findViewById(R.id.pass)
            //  get value
            val email1:String =emailent.text.toString()
            val pass1:String =passent.text.toString()
            val emailerror :TextView =findViewById(R.id.emailwrong)
            val passerror :TextView =findViewById(R.id.passwrong)
            if(!email1.contains('@' ))
            {
                emailerror.visibility= View.VISIBLE

            }else {
                emailerror.visibility= View.INVISIBLE

            }
            if(pass1.length<5){
                passerror.visibility= View.VISIBLE

            }else {
                passerror.visibility= View.INVISIBLE

            }
           val sharedPreferences=this.getSharedPreferences("app", Context.MODE_PRIVATE)
           val editor=sharedPreferences.edit()

           if(pass1.length>=5 && email1.contains('@')) {
               val intent = Intent(this@LoginScreen, TopBookShow ::class.java )
               startActivity(intent)

               emailerror.visibility = View.INVISIBLE
                passerror.visibility = View.INVISIBLE
                emailent.setText("")
                passent.setText("")
                editor.putBoolean("islogin",true)

            }
          /* val result=editor.commit()
           if(result){
               val intent= Intent(this@LoginScreen,LoginScreen::class.java)
               startActivity(intent)
           }
           else {
               Toast.makeText(this,"Faliure",Toast.LENGTH_LONG).show()
           }
*/




            }
        }












}




