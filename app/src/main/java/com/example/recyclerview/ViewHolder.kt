package com.example.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vertical.view.*

class ViewHolder(view:View):RecyclerView.ViewHolder(view) {

fun bind2(item2:Model){
    itemView.txtCream.text=item2.title
    itemView.brand.text=item2.brand
    itemView.madeIn.text=item2.madeIn
    itemView.cream.setBackgroundResource(item2.image)

}

}