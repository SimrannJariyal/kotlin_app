package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    // Declare your UI components
    private lateinit var length: EditText
    private lateinit var breadth: EditText
    private lateinit var btn: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_activity)

        // Initialize your UI components
        length = findViewById(R.id.length) // Make sure this ID matches your XML
        breadth = findViewById(R.id.breadth)// Make sure this ID matches your XML
        btn = findViewById(R.id.btn) // Make sure this ID matches your XML
        textView = findViewById(R.id.txt_view) // Make sure this ID matches your XML

        // Set an OnClickListener for the button
        btn.setOnClickListener {
            // Retrieve input and display it
            val lengthValue = length.text.toString()
            val breadthValue = breadth.text.toString()
            // Perform calculations or display results
            textView.text = "Length: $lengthValue, Breadth: $breadthValue"
        }
    }
}
