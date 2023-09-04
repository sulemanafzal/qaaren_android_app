package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qaarenapp.adapter.CategoryAdapter
import com.example.qaarenapp.databinding.FragmentCategoriesBinding

class CategoriesFragment : Fragment() {

    lateinit var binding: FragmentCategoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoriesBinding.inflate(layoutInflater, container, false)

        // Your list of categories
        val categoryList = listOf(
            "Electronics",
            "Clothing",
            "Books",
            "Home & Kitchen",
            "Sports & Outdoors",
            "Toys & Games",
            "Beauty & Personal Care",
            "Furniture",
            "Health & Wellness",
            "Jewelry & Watches",
            "Automotive",
            "Grocery & Gourmet",
            "Music & Instruments",
            "Pet Supplies",
            "Tools & Home Improvement",
            "Office & School Supplies",
            "Art & Crafts",
            "Baby Products",
            "Travel & Luggage",
            "Shoes",
            "Electrical Appliances",
            "Outdoor Clothing",
            "Computers & Accessories",
            "Garden & Outdoor",
            "Food & Beverages",
            "Fitness & Exercise",
            "Movies & TV Shows",
            "Party Supplies",
            "Home Decor",
            "Industrial & Scientific"
        )

        // Initialize RecyclerView
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext())

        // Create and set the adapter
        val adapter = CategoryAdapter(requireContext(), categoryList)
        binding.recyclerview.adapter = adapter

        return binding.root
    }
}