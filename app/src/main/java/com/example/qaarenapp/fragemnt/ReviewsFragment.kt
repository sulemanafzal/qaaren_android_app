package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.ReviewsAdapter
import com.example.qaarenapp.databinding.FragmentReviewsBinding
import com.example.qaarenapp.model.ReviewsModel

class ReviewsFragment : Fragment() {

    lateinit var binding: FragmentReviewsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReviewsBinding.inflate(layoutInflater, container, false)

        val dataList = listOf(
            ReviewsModel(
                ratingReviews = "Rating & Reviews",
                reviews = "4.8",
                ratingText = "23",
                text = "ratings",
                rating1 = 5.0f,
                rating2 = 4.0f,
                rating3 = 3.0f,
                rating4 = 2.0f,
                rating5 = 1.0f,
                progress1 = 70,
                progress2 = 50,
                progress3 = 40,
                progress4 = 20,
                progress5 = 10,
                numberReviews1 = "12",
                numberReviews2 = "9",
                numberReviews3 = "5",
                numberReviews4 = "4",
                numberReviews5 = "2"
            ),
            // Add more MyData objects as needed
        )

        val adapter = ReviewsAdapter(requireContext(), dataList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }
}