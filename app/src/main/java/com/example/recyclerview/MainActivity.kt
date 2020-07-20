package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerview1:RecyclerView?=null
    private var recyclerview2:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       initViews()
        adapter()

    }
    private fun initViews(){
        recyclerview1 = findViewById(R.id.recyclerview1)
        recyclerview2 = findViewById(R.id.recyclerview2)

    }
    private fun adapter(){
        val list= arrayListOf<String>()
        for(i in 1..50){
            list.add("Помада $i")
        }
        val adapter=CosmeticAdapter(list)
        recyclerview1?.adapter=adapter

        val list2= arrayListOf<Model>()
        for (i in 1..50){
            list2.add(Model(R.drawable.cream,"Крем для лица $i","YVES ROCHER $i","Made in France $i"))
        }
        val adapter2=Adapter(list2)
        recyclerview2?.adapter=adapter2


    }
}
