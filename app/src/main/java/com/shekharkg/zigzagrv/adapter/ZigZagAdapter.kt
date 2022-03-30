package com.shekharkg.zigzagrv.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shekharkg.zigzagrv.databinding.ItemZigzagBinding

class ZigZagAdapter(
    span: Int,
    totalCount: Int
) :
    RecyclerView.Adapter<ZigZagViewHolder>() {

    private val totalItemCount = totalCount
    private val rowCounts: Int =
        (totalCount / span) + (if ((totalCount % span == 0)) 0 else 1)
    private val spanCount = span


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZigZagViewHolder {
        val binding = ItemZigzagBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ZigZagViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ZigZagViewHolder, position: Int) {
        val direction =
            if (position % 2 == 0) View.LAYOUT_DIRECTION_LTR else View.LAYOUT_DIRECTION_RTL

        val start = position * spanCount
        var end = start + spanCount

        if (end > totalItemCount) {
            end -= (end - totalItemCount)
        }

        holder.bind(GridLayoutManager(holder.itemView.context, spanCount), direction, start, end)
    }


    override fun getItemCount(): Int {
        return rowCounts
    }


}