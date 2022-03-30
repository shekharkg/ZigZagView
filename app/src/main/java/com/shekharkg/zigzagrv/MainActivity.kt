package com.shekharkg.zigzagrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.shekharkg.zigzagrv.adapter.ZigZagAdapter
import com.shekharkg.zigzagrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRV()
    }

    private fun setupRV() {
        binding.zigZagRV.layoutManager = LinearLayoutManager(this)
        binding.zigZagRV.adapter = ZigZagAdapter(5, 7)
    }
}