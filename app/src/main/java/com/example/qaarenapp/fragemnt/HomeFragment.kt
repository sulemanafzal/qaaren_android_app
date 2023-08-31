package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qaarenapp.HomeItemMode
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.HomeItemAdapter
import com.example.qaarenapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sample data to populate the dataList
        val dataList = listOf(

            HomeItemMode(
                R.drawable.stand,
                "30%",
                "Stand",
                "6",
                "24 - 50 SAR",

                ),
            HomeItemMode(
                R.drawable.book_shelves,
                "10%",
                "Book Shelves",
                "16",
                "60 - 150 SAR",

                ),
            HomeItemMode(
                R.drawable.sofa,
                "20%",
                "Sofa",
                "5",
                "70 - 110 SAR",

                ),
            HomeItemMode(
                R.drawable.sofa,
                "50%",
                "Stand",
                "60",
                "24 - 50 SAR",

                ),
            HomeItemMode(
                R.drawable.iphone_image,
                "30%",
                "Stand",
                "6",
                "2400 - 5000 SAR",
            ),
            // Add more items as needed
        )


        val adapter = HomeItemAdapter(dataList)
        val spanCount = 2 // Set the number of columns in the grid
        val layoutManager = GridLayoutManager(requireContext(), spanCount)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter
    }

}