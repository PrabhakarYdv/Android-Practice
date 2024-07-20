package com.prabhakar.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.btn
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printLog("onCreate")
        btn.setOnClickListener{
            startActivity(Intent(this,ActivityB::class.java))
        }
    }


    override fun onStart() {
        super.onStart()
        printLog("onStart")
    }

    override fun onPause() {
        super.onPause()
        printLog("onPause")
    }

    override fun onResume() {
        super.onResume()
        printLog("onResume")
    }

    override fun onStop() {
        super.onStop()
        printLog("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        printLog("onDestroy")
    }
}

private fun printLog(msg: String) {
    Log.d("Tag", msg)
}