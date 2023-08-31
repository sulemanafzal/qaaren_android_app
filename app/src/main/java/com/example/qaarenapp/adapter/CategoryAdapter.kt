package com.example.qaarenapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.qaarenapp.R
import com.example.qaarenapp.model.CategoryItemModel

class CategoryAdapter(private val languageList: ArrayList<CategoryItemModel>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val languageItem: CategoryItemModel = languageList[position]
        holder.languageNameTextView.text = languageItem.category
        holder.radioButton.isChecked = languageItem.isSelected
        holder.radioButton.setOnClickListener {
            for (item in languageList) {
                item.isSelected
            }
            languageItem.isSelected
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return languageList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val languageNameTextView: TextView = itemView.findViewById(R.id.category_name)
        val radioButton: RadioButton = itemView.findViewById(R.id.radio_button)
    }
}