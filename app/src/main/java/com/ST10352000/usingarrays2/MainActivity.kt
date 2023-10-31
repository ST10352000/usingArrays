package com.ST10352000.usingarrays2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etNumber: EditText? = null
    private var tvDisplayStoredNumber: TextView? = null
    private var tvDisplayAnswer: TextView? = null

    private var intNumbers = Array<Int>(10) {0}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnteNumber = findViewById<Button>(R.ID.btn)
    }
}