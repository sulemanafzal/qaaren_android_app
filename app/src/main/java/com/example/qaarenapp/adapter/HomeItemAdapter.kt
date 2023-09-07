package com.example.qaarenapp.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.example.qaarenapp.R
import com.example.qaarenapp.model.HomeItemModel
import com.example.qaarenapp.databinding.HomeItemBinding
import com.example.qaarenapp.fragemnt.DetailItemFragment

class HomeItemAdapter(private val dataList: List<HomeItemModel>) :
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

        fun bind(data: HomeItemModel) {
            // Your view binding logic here
        }

        init {
            itemView.setOnClickListener {
                val clickItem = dataList[adapterPosition]
                val fragment = DetailItemFragment()
                val bundle = Bundle()
                bundle.putInt("imagemin", clickItem.imagemain)
                bundle.putString("productName", clickItem.txt_productName)
                bundle.putString("rating", clickItem.rating_bar.toString())
                bundle.putString("numberRating", clickItem.tv_rating)
                bundle.putString("startToEndPrice", clickItem.price_start_to_end)
                bundle.putInt("like", clickItem.like_logo)

                // Pass a unique tag or identifier to each fragment
                bundle.putString("fragmentTag", "item_${clickItem.cardView}")

                fragment.arguments = bundle

                val transaction: FragmentTransaction = (itemView.context as AppCompatActivity)
                    .supportFragmentManager.beginTransaction()

                // Use a unique tag for each fragment transaction
                transaction.replace(R.id.framelayout, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
    }
}
