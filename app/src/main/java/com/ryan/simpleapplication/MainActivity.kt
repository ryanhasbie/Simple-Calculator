package com.ryan.simpleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private final var OPERATION:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalculateOnClickListener()
    }

    private fun calculator (number1:Int, number2:Int) : String {
        var result: Int = 0
        when (OPERATION) {
            "+" -> result = number1 + number2
            "-" -> result = number1 - number2
            "x" -> result = number1 * number2
            ":" -> result = number1 / number2
        }
        return result.toString()
    }

    private fun showToast(message:String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    private fun buttonCalculateOnClickListener() {
        val buttonCalculate = findViewById<Button>(R.id.button_calculate)
        buttonCalculate.setOnClickListener {
            val editTextNumber1 = findViewById<EditText>(R.id.edit_number1)
            val editTextNumber2 = findViewById<EditText>(R.id.edit_number2)
            val radioGroupOperations = findViewById<RadioGroup>(R.id.radio_group_operation)
            val textViewResult = findViewById<TextView>(R.id.text_result)

            if (editTextNumber1.text.isNullOrEmpty() || editTextNumber2.text.isNullOrEmpty()) {
                showToast("Input is invalid...")
            } else if (OPERATION.isNullOrEmpty()) {
                showToast("Choose operation...")
            } else {
                val editTextNumber1Value = editTextNumber1.text.toString().toInt()
                val editTextNumber2Value = editTextNumber2.text.toString().toInt()
                textViewResult.text = calculator(editTextNumber1Value, editTextNumber2Value)
            }

            radioGroupOperations.setOnCheckedChangeListener { group, checkedId ->
                val radioButton = findViewById<RadioButton>(group.checkedRadioButtonId)
                OPERATION = radioButton.text.toString()
                textViewResult.text = "Result"
            }
        }
    }

}