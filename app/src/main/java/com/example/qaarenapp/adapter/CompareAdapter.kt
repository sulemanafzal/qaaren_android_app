package com.example.qaarenapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.qaarenapp.R
import com.example.qaarenapp.databinding.CompareItemBinding
import com.example.qaarenapp.model.CompareModel

class CompareAdapter (private val context: Context, private val data: List<CompareModel>) :
    RecyclerView.Adapter<CompareAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CompareItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Bind data to views here
        val comparedata = data[position]
        holder.bind(comparedata)

    }

    override fun getItemCount(): Int {
        return data.size
    }


    inner class ViewHolder(private val binding: CompareItemBinding) :RecyclerView.ViewHolder(binding.root) {
        // Initialize your views here
        fun bind(comparedata: CompareModel) {

            binding.tvItemName.text =comparedata.itemName
            binding.tvPrice.text = comparedata.price
            binding.tvLocal.text = comparedata.locationType
            binding.tvNearest.text = comparedata.nearest
            binding.rating.rating = comparedata.rating
            binding.tvTotalRating.text = comparedata.ratingCount.toString()
            binding.date.text = comparedata.date



          /*  val itemName: TextView = itemView.findViewById(R.id.tv_itemName)
            val companyLogo: ImageView = itemView.findViewById(R.id.tv_companyname)
            val itemPrice: TextView = itemView.findViewById(R.id.tv_price)
            val location: TextView = itemView.findViewById(R.id.tv_local)
            val nearest: TextView = itemView.findViewById(R.id.tv_nearest)
            val rating: RatingBar = itemView.findViewById(R.id.rating)
            val totalRating: TextView = itemView.findViewById(R.id.tv_total_rating)
            val itemdate: TextView = itemView.findViewById(R.id.date)*/
        }
    }
}