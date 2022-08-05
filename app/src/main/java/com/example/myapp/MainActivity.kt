package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.databinding.ActivityMainBinding

private var number = 0

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val titleTextView = binding.title

        val incrementButton = binding.floatingButton

        incrementButton.setOnClickListener {
            number++
            titleTextView.text = "Number: $number"
        }
    }
}