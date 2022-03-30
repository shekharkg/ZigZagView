package com.shekharkg.zigzagrv.adapter

import androidx.recyclerview.widget.RecyclerView
import com.shekharkg.zigzagrv.databinding.ItemCardBinding

class MyViewHolder(private val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(index: Int){
        binding.itemText.text = "$index"
    }
}