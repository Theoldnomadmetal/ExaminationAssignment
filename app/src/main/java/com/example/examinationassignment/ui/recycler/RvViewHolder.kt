package com.example.examinationassignment.ui.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.examinationassignment.data.ItemData
import kotlinx.android.synthetic.main.item_layout.view.*

class RvViewHolder(view: View):RecyclerView.ViewHolder(view){
    fun bind(
        itemData: ItemData,
        listener: ItemListener
    ){
        itemView.item_description.text = itemData.name
        itemView.setOnClickListener {
            listener.itemsClick(itemData)
        }

    }
}