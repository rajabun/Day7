package com.example.day7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.content.Intent

const val EXTRA_MESSAGE = "Go to Page Two !"

class MainActivity : AppCompatActivity() {

    val EXTRA_MESSAGE = "Go to Page Two !"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToPage2(view:View)
    {
        val editText = findViewById<TextView>(R.id.text_message)
        var message = editText.text.toString()
        message = "hello"
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}