package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.horizontal.view.*

class CosmeticAdapter(private val array: ArrayList<String>):RecyclerView.Adapter<CosmeticViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CosmeticViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.horizontal,parent, false)
        val holder = CosmeticViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return array.size

    }

    override fun onBindViewHolder(holder: CosmeticViewHolder, position: Int) {
        val item = array[position]

        holder.bind(item)



    }
}
