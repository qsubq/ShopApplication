package com.example.shopapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shopapplication.databinding.ActivityMainBinding
import com.example.shopapplication.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}