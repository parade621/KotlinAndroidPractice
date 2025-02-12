package com.parade621.codelab_recyclerview_ex.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.parade621.codelab_recyclerview_ex.R
import com.parade621.codelab_recyclerview_ex.databinding.RvItemBinding
import com.parade621.codelab_recyclerview_ex.model.Affirmation

class RVAdapter(
    private val context : Context,
    private val dataset: List<Affirmation>
    ):RecyclerView.Adapter<RVAdapter.ItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):RVAdapter.ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_item,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
    inner class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        fun bind(item: Affirmation) {
            val rvText: TextView = view.findViewById(R.id.rv_tv)
            rvText.text = context.resources.getString(item.stringResourceId)
        }
    }
}