package com.example.qaarenapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.qaarenapp.R

class CategoryAdapter(private val context: Context, private val list: List<String>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryVH>() {

    private val selectedItems = mutableListOf<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryVH {
        val view = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false)
        return CategoryVH(view)
    }

    override fun onBindViewHolder(holder: CategoryVH, position: Int) {
        holder.radioButton.isChecked = selectedItems.contains(position)
        holder.loadData(position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class CategoryVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val categoryName: TextView = itemView.findViewById(R.id.category_name)
        val radioButton: RadioButton = itemView.findViewById(R.id.radio_button)

        fun loadData(position: Int) {
            categoryName.text = list[position]
            val listener = View.OnClickListener {
                if (selectedItems.contains(adapterPosition)) {
                    selectedItems.remove(adapterPosition)
                } else {
                    selectedItems.add(adapterPosition)
                }
                notifyDataSetChanged()
                // You can also handle item click actions here
                // For example, showing a Toast for selected items
            }
            itemView.setOnClickListener(listener)
            radioButton.setOnClickListener(listener)
        }
    }
}
