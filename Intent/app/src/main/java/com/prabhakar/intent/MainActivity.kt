package com.prabhakar.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn).setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.putExtra("txt","I am coming from Main Activity")
            startActivity(intent)
        }
    }
}