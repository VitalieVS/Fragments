package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentHolder, firstFragment)
            commit()
        }

        googleButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.fragmentHolder, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        youtubeButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.fragmentHolder, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}