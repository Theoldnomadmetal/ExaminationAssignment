package com.example.examinationassignment.ui.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examinationassignment.R
import com.example.examinationassignment.data.ItemData

class RvAdapter(private val listener: ItemListener):RecyclerView.Adapter<RvViewHolder>() {
    private val list = arrayListOf<ItemData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return RvViewHolder(view)

    }
    fun update(list : List<ItemData>?){
        if (list!= null){
            this.list.clear()
            this.list.addAll(list)
            notifyDataSetChanged()
        }
    }
    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.bind(list[position],listener)
    }
}