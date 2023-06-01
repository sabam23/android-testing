package com.example.testing

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        messageTv = findViewById(R.id.message_textview)

        val Btn1: Button = findViewById(R.id.button_1)
        val Btn2: Button = findViewById(R.id.button_2)
        val Btn3: Button = findViewById(R.id.button_3)

        Btn1.setOnClickListener {
            updateMessage("1")
        }

        Btn2.setOnClickListener {
            updateMessage("2")
        }

        Btn3.setOnClickListener {
            updateMessage("3")
        }
    }

    lateinit var messageTv: TextView
    private fun updateMessage(message: String) {
        messageTv.text = message
    }
}