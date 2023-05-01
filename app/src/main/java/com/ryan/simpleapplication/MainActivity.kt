package com.ryan.simpleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalculateOnClickListener()
    }

    private fun calculator (number1:Int, number2:Int) : String {
        val result = number1 + number2
        return result.toString()
    }

    private fun showToast(message:String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    private fun buttonCalculateOnClickListener() {
        val buttonCalculate = findViewById<Button>(R.id.button_calculate)
        buttonCalculate.setOnClickListener {
            val editTextNumber1 = findViewById<EditText>(R.id.edit_number1).text.toString().toInt()
            val editTextNumber2 = findViewById<EditText>(R.id.edit_number2).text.toString().toInt()
            val textViewResult = findViewById<TextView>(R.id.text_result)
            textViewResult.text = calculator(editTextNumber1, editTextNumber2)
        }
    }

}