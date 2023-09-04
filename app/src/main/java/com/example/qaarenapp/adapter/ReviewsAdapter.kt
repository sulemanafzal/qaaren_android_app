package com.example.qaarenapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.RatingBar
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import com.example.qaarenapp.R
import com.example.qaarenapp.model.ReviewsModel

class ReviewsAdapter(private val context: Context, private val dataList: List<ReviewsModel>) :
    RecyclerView.Adapter<ReviewsAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvRatingReviews: TextView = itemView.findViewById(R.id.tv_rating_reviews)

        val rating1: RatingBar = itemView.findViewById(R.id.rating_1)

        val progressBar1: ProgressBar = itemView.findViewById(R.id.progress_bar_1)
        val progressBar2: ProgressBar = itemView.findViewById(R.id.progress_bar_2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.reviews_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        holder.tvRatingReviews.text = data.ratingReviews
        holder.rating1.rating = data.rating1

        holder.progressBar1.progress = data.progress1
        holder.progressBar2.progress = data.progress2

    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
