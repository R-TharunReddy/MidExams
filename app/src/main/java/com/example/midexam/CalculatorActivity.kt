package com.example.midexam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val etFirstNumber = findViewById<EditText>(R.id.et_firstNumber)
        val etSecondNumber = findViewById<EditText>(R.id.et_secondNumber)
        val btnAdd = findViewById<Button>(R.id.btn_add)
        val btnSubtract = findViewById<Button>(R.id.btn_subtract)
        val btnMultiply = findViewById<Button>(R.id.btn_multiply)
        val btnDivide = findViewById<Button>(R.id.btn_divide)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        btnAdd.setOnClickListener {
            val result = etFirstNumber.text.toString().toDouble() + etSecondNumber.text.toString().toDouble()
            tvResult.text = "Result: $result"
        }

        btnSubtract.setOnClickListener {
            val result = etFirstNumber.text.toString().toDouble() - etSecondNumber.text.toString().toDouble()
            tvResult.text = "Result: $result"
        }

        btnMultiply.setOnClickListener {
            val result = etFirstNumber.text.toString().toDouble() * etSecondNumber.text.toString().toDouble()
            tvResult.text = "Result: $result"
        }

        btnDivide.setOnClickListener {
            val result = etFirstNumber.text.toString().toDouble() / etSecondNumber.text.toString().toDouble()
            tvResult.text = "Result: $result"
        }
    }
}
