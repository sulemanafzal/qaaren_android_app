package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.SamAdapter
import com.example.qaarenapp.databinding.FragmentCategoriesBinding
import com.example.qaarenapp.databinding.FragmentHomeCategoryBinding
import com.example.qaarenapp.model.HomeItemMode

class HomeCategoryFragment : Fragment() {

    lateinit var binding: FragmentHomeCategoryBinding
    private val cateItems = arrayListOf<HomeItemMode>(
        HomeItemMode(
            R.drawable.iphone_image,
            "Heatwave: Hospitals under KMC put on standby...",
            "ARY News",
            "12.May.12",
            "323 433"

        ),
        HomeItemMode(
            R.drawable.sofa,
            "Heatwave: Hospitals under KMC put on standby...",
            "ARY News",
            "12.May.12",
            "323 433"
        ),
        HomeItemMode(
            R.drawable.book_shelves,
            "Heatwave: Hospitals under KMC put on standby...",
            "ARY News",
            "12.May.12",
            "323 433"

        ),

        )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeCategoryBinding.inflate(layoutInflater, container, false)

        val samAdapter = SamAdapter(cateItems)

        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = samAdapter
        }

        return binding.root
    }
}