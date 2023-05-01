package com.ryan.simpleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Get id from text view
        // val myTextView = findViewById<TextView>(R.id.text_view)
        // Update text in id = text_view
        // myTextView.text = "New Text View"
        showToast("Hello Ryan..")
    }

    private fun showToast(message:String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}