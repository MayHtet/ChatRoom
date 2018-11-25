package com.example.admin.testkotlin.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.admin.testkotlin.R
import com.example.admin.testkotlin.viewholders.NewListViewHolder

class NewListRecyclerAdapter : RecyclerView.Adapter<NewListViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NewListViewHolder {
        var view = LayoutInflater.from(p0.context).inflate(R.layout.item_view,p0,false)
        return NewListViewHolder(view)

    }

    override fun getItemCount(): Int {
        return 5;
    }

    override fun onBindViewHolder(p0: NewListViewHolder, p1: Int) {
        }
}