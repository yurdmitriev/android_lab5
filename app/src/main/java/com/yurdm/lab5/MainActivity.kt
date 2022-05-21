package com.yurdm.lab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yurdm.lab5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.task1.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }

        binding.task2.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}