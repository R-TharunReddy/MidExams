package com.example.midexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenCalculator = findViewById<Button>(R.id.btn_openCalculator)
        val btnOpenSpinner = findViewById<Button>(R.id.btn_openSpinner)
        val tvData = findViewById<TextView>(R.id.tv_data)

        btnOpenCalculator.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        btnOpenSpinner.setOnClickListener {
            val intent = Intent(this, SpinnerActivity::class.java)
            startActivity(intent)
        }

        // Logic to receive and display data from the other activities
        val data = intent.getStringExtra("data")
        if (data != null) {
            tvData.text = "Received data: $data"
        }
    }
}
