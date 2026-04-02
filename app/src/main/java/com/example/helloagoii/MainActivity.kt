package com.example.helloagoii

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Hello Agoii"
            textSize = 24f
            setPadding(16, 16, 16, 16)
        }

        setContentView(textView)
    }
}
