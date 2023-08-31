package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.CategoryAdapter
import com.example.qaarenapp.databinding.FragmentCategoriesBinding
import com.example.qaarenapp.model.CategoryItemModel

class CategoriesFragment : Fragment() {

    lateinit var binding: FragmentCategoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoriesBinding.inflate(layoutInflater, container, false)

        val categoryList = arrayListOf(
            CategoryItemModel("Mobile Phones"),
            CategoryItemModel("Computers"),
            CategoryItemModel("Tablets"),
            CategoryItemModel("Electronics"),
            CategoryItemModel("Clothing"),
            CategoryItemModel("Books"),
            CategoryItemModel("Home Appliances"),
            CategoryItemModel("Beauty and Personal Care"),
            CategoryItemModel("Sports and Outdoors"),
            CategoryItemModel("Furniture"),
            CategoryItemModel("Toys and Games"),
            CategoryItemModel("Jewelry"),
            CategoryItemModel("Health and Wellness"),
            CategoryItemModel("Automotive"),
            CategoryItemModel("Grocery"),
            CategoryItemModel("Music and Movies"),
            CategoryItemModel("Pet Supplies")
        )


        binding.recyclerview.apply {
            adapter = CategoryAdapter(categoryList)
            layoutManager = LinearLayoutManager(context)

            return binding.root

        }
    }
}