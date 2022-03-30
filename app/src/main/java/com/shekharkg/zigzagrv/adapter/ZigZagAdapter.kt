package com.shekharkg.zigzagrv.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shekharkg.zigzagrv.databinding.ItemZigzagBinding

class ZigZagAdapter(private val context: Context, private val spanCount: Int) : RecyclerView.Adapter<ZigZagViewHolder>() {

    val rvItemCount = 10


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZigZagViewHolder {
        val binding = ItemZigzagBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ZigZagViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ZigZagViewHolder, position: Int) {
        if (position % 2 == 0) {
            holder.bind(GridLayoutManager(context, spanCount))
        } else {
            holder.bind(GridLayoutManager(context, spanCount, LinearLayoutManager.VERTICAL, true))
        }
    }


    override fun getItemCount(): Int {
        return rvItemCount
    }


}