package com.prabhakar.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.prabhakar.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentManager = supportFragmentManager
        binding.apply {
            btn1.setOnClickListener {
                launchFragmentFirst()
            }
            btn2.setOnClickListener {
                launchFragmentSecond()
            }
        }
    }

    private fun launchFragmentFirst() {
        val fragmentFirst = FirstFragment()
        val fragmentTransaction =
            fragmentManager.beginTransaction().addToBackStack("First Fragment")
        fragmentTransaction.add(R.id.container, fragmentFirst, "First Fragment").commit()
    }

    private fun launchFragmentSecond() {
        val fragmentSecond = SecondFragment()
        val fragmentTransaction =
            fragmentManager.beginTransaction().addToBackStack("Second Fragment")
        fragmentTransaction.add(R.id.container, fragmentSecond, "Second Fragment").commit()
    }
}