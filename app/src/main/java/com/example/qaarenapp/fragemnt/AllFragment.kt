package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.HomeItemAdapter
import com.example.qaarenapp.databinding.FragmentAllBinding
import com.example.qaarenapp.model.HomeItemModel

class AllFragment : Fragment() {

    lateinit var binding: FragmentAllBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllBinding.inflate(layoutInflater, container, false)


        // Sample data to populate the dataList
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


        val adapter = HomeItemAdapter(dataList)
        val layoutManager = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter


        return binding.root

    }
}