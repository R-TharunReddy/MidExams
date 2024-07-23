package com.example.midexam

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val spinnerUnits: Spinner = findViewById(R.id.spinner_units)
        val etInput: EditText = findViewById(R.id.et_input)
        val btnConvert: Button = findViewById(R.id.btn_convert)
        val tvResult: TextView = findViewById(R.id.tv_result)

        // Set Spinner items programmatically
        val units = arrayOf("Meters to Feet", "Kilograms to Pounds", "Celsius to Fahrenheit")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerUnits.adapter = adapter

        btnConvert.setOnClickListener {
            val inputValue = etInput.text.toString().toDoubleOrNull()
            val selectedUnit = spinnerUnits.selectedItem.toString()

            if (inputValue != null) {
                val result = when (selectedUnit) {
                    "Meters to Feet" -> inputValue * 3.28084
                    "Kilograms to Pounds" -> inputValue * 2.20462
                    "Celsius to Fahrenheit" -> (inputValue * 9/5) + 32
                    else -> inputValue
                }
                tvResult.text = "Result: $result"
            } else {
                tvResult.text = "Please enter a valid number"
            }
        }
    }
}
