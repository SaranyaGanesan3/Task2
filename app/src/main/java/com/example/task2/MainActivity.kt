package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var clickCount= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Countview = findViewById<TextView>(R.id.Countview)
        val clickbutton= findViewById<TextView>(R.id.clickbutton)
        val Nametext= findViewById<TextInputLayout>(R.id.Nametext)

        clickbutton.setOnClickListener{

            val Username= Nametext.editText?.text?.toString()
            val maskedUserName =
                if(Username.isNullOrEmpty()) "Somebody"
                else
                    Username

            clickCount++
            Countview.text="$maskedUserName clicked $clickCount times"
        }
    }
}