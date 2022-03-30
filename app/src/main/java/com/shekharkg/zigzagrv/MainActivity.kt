package com.shekharkg.zigzagrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.GridLayout.HORIZONTAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shekharkg.zigzagrv.adapter.MyAdapter
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
        binding.zigZagRV.adapter = MyAdapter()
    }
}