package com.shekharkg.zigzagrv.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shekharkg.zigzagrv.databinding.ItemZigzagBinding

class ZigZagAdapter(
    private val context: Context,
    private val spanCount: Int,
    private val rvItemCount: Int
) :
    RecyclerView.Adapter<ZigZagViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZigZagViewHolder {
        val binding = ItemZigzagBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ZigZagViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ZigZagViewHolder, position: Int) {
        if (position % 2 == 0) {
            holder.bind(GridLayoutManager(context, spanCount), View.LAYOUT_DIRECTION_LTR)
        } else {
            holder.bind(GridLayoutManager(context, spanCount), View.LAYOUT_DIRECTION_RTL)
        }
    }


    override fun getItemCount(): Int {
        return rvItemCount
    }


}