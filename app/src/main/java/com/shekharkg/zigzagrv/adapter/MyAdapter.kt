package com.shekharkg.zigzagrv.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shekharkg.zigzagrv.databinding.ItemCardBinding

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

    val rvItemCount = 5

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return rvItemCount
    }
}