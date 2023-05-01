package com.ryan.simpleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalculateOnClickListener()
    }

    private fun showToast(message:String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    private fun buttonCalculateOnClickListener() {
        val buttonCalculate = findViewById<Button>(R.id.button_calculate)
        buttonCalculate.setOnClickListener {
            showToast("Hello Ryan!")
        }
    }

}