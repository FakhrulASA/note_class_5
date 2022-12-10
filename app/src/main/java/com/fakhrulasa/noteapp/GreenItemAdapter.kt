package com.fakhrulasa.noteapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fakhrulasa.noteapp.databinding.ItemListBinding

class GreenItemAdapter(
    private var list: List<ItemModel>
) : RecyclerView.Adapter<GreenItemAdapter.GreenViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: GreenViewHolder, position: Int) {
        holder.bindView(list, position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GreenViewHolder {
        return GreenViewHolder(
            ItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    class GreenViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(list: List<ItemModel>, position: Int) {
            binding.textView3.text = list[position].title
            binding.textDescription.text = list[position].description
        }
    }
}