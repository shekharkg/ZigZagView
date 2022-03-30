package com.shekharkg.zigzagrv.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shekharkg.zigzagrv.databinding.ItemCardBinding

class MyAdapter(
    private val start: Int,
    private val end: Int
) : RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(start + position)
    }

    override fun getItemCount(): Int {
        return end - start
    }
}