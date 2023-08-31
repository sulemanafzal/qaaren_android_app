package com.example.qaarenapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qaarenapp.model.HomeItemMode
import com.example.qaarenapp.databinding.HomeItemBinding

class HomeItemAdapter(private val dataList: List<HomeItemMode>) :
    RecyclerView.Adapter<HomeItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = HomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.bind(data)
    }


    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(private val binding: HomeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: HomeItemMode) {
            // Declare your views here

            binding.imageView.setImageResource(data.imagemain)
            //binding.rating.rating = data.rating_bar
            binding.textViewRating.text = data.tv_rating
            binding.tvStarttoendprice.text = data.price_start_to_end
            binding.tvProductName.text = data.txt_productName
            binding.tvPercent.text = data.txt_percent

            // Initialize your views and set up any additional logic here
        }
    }
}