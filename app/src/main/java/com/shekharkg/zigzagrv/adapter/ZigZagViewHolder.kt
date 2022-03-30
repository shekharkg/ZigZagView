package com.shekharkg.zigzagrv.adapter

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shekharkg.zigzagrv.databinding.ItemZigzagBinding

class ZigZagViewHolder(private val binding: ItemZigzagBinding) :
    RecyclerView.ViewHolder(binding.root) {


    fun bind(
        manager: GridLayoutManager, direction: Int,
        startIndex: Int, endIndex: Int
    ) {
        binding.itemRV.layoutManager = manager
        binding.itemRV.adapter = MyAdapter(startIndex, endIndex)
        binding.itemRV.layoutDirection = direction
    }

}