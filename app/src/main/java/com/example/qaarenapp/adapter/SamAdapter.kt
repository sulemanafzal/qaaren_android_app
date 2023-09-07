package com.example.qaarenapp.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.example.qaarenapp.R
import com.example.qaarenapp.fragemnt.DetailItemFragment
import com.example.qaarenapp.model.HomeItemModel

class SamAdapter(private val newsItems: List<HomeItemModel>) :
    RecyclerView.Adapter<SamAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = newsItems[position]
        holder.title.text = item.txt_productName
        holder.image.setImageResource(item.imagemain)
        holder.startendprice.text = item.price_start_to_end
    }

    override fun getItemCount(): Int = newsItems.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.product_image)
        val title = itemView.findViewById<TextView>(R.id.product_name)
        val startendprice = itemView.findViewById<TextView>(R.id.tv_starttoendprice)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val clickitem = newsItems[position]

                    val fragment = DetailItemFragment()
                    val bundle = Bundle()
                    bundle.putInt("image", clickitem.imagemain)
                    bundle.putString("title", clickitem.txt_productName)
                    bundle.putString("postDate", clickitem.price_start_to_end)

                    fragment.arguments = bundle

                    val transaction: FragmentTransaction =
                        (itemView.context as AppCompatActivity).supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.framelayout, fragment)
                    transaction.addToBackStack(null)
                    transaction.commit()
                }
            }
        }
    }
}

