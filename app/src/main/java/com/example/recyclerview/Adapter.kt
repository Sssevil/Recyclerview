package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val array:ArrayList<Model>):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.vertical,parent,false)
        val holder=ViewHolder(view)
        return holder

    }

    override fun getItemCount(): Int {
      return array.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item2=array[position]
        holder.bind2(item2)

    }


}