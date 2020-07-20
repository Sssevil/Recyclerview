package com.example.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.horizontal.view.*

class CosmeticViewHolder(view: View): RecyclerView.ViewHolder(view) {

    fun bind(item: String){
        itemView.txtlip.text=item

    }
}