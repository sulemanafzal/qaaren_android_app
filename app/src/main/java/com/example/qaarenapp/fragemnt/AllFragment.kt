package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.HomeItemAdapter
import com.example.qaarenapp.adapter.TempAdapter
import com.example.qaarenapp.databinding.FragmentAllBinding
import com.example.qaarenapp.model.HomeItemMode
import com.google.android.material.tabs.TabLayoutMediator

class AllFragment : Fragment() {

    lateinit var binding: FragmentAllBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllBinding.inflate(layoutInflater, container, false)


            // Sample data to populate the dataList
    val dataLis = listOf(

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
    )

        val adapter = HomeItemAdapter(dataLis)
        val layoutManager = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter


        return binding.root

    }
}