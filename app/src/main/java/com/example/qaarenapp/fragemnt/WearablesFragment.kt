package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.HomeItemAdapter
import com.example.qaarenapp.databinding.FragmentWearablesBinding
import com.example.qaarenapp.model.HomeItemModel

class WearablesFragment : Fragment() {

    lateinit var binding: FragmentWearablesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWearablesBinding.inflate(layoutInflater, container, false)

        val dataList = listOf(
            HomeItemModel(
                "1",
                "Popular Products",
                "Super summer sale",
                R.drawable.iphone_pro_max,
                "20%",
                "IPhone 14 Pro max",
                4.5f,
                "30",
                "2400 - 5000 SAR",
                R.drawable.heart,

                "2",
                R.drawable.iphone_pro_max,
                "20%",
                "IPhone 14 Pro max",
                4.5f,
                "30",
                "2400 - 5000 SAR",
                R.drawable.heart,
            ),

            HomeItemModel(
                "1",
                "Popular Products",
                "Super summer sale",
                R.drawable.iphone_pro_max,
                "20%",
                "IPhone 14 Pro max",
                4.5f,
                "30",
                "2400 - 5000 SAR",
                R.drawable.heart,

                "2",
                R.drawable.iphone_pro_max,
                "20%",
                "IPhone 14 Pro max",
                4.5f,
                "30",
                "2400 - 5000 SAR",
                R.drawable.heart,
            ),
            HomeItemModel(
                "1",
                "Popular Products",
                "Super summer sale",
                R.drawable.iphone_pro_max,
                "20%",
                "IPhone 14 Pro max",
                4.5f,
                "30",
                "2400 - 5000 SAR",
                R.drawable.heart,

                "2",
                R.drawable.iphone_pro_max,
                "20%",
                "IPhone 14 Pro max",
                4.5f,
                "30",
                "2400 - 5000 SAR",
                R.drawable.heart,
            ),

            )

        val groceryadapter = HomeItemAdapter(dataList)

        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = groceryadapter
        }

        return binding.root
    }
}