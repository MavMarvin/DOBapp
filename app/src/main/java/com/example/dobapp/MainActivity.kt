package com.example.dobapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.javaClass as javaClass1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcButton.setOnClickListener {
            val enterDOB: Int = enterDOB.text.toString().toInt()
            var textTwo = 2019-enterDOB
            var enterName = enterName.text.toString()
            textOne.text = "Hello $enterName! You are $textTwo years old now!"
        }
    }
}