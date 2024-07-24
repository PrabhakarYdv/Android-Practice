package com.prabhakar.intent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val text = findViewById<TextView>(R.id.text)
        val data = intent.getStringExtra("txt")
        text.text = data
    }
}