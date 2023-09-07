package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.CompareAdapter
import com.example.qaarenapp.databinding.FragmentCompareBinding
import com.example.qaarenapp.model.CompareModel

class CompareFragment : Fragment() {

    lateinit var binding:FragmentCompareBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCompareBinding.inflate(layoutInflater, container, false)

        // Create a list of YourDataModel objects
        val compareList= arrayListOf(
            CompareModel(
                itemName = "IPhone 14 Pro Max",
                R.drawable.amazonlogo,
                price = "SAR 3000",
                locationType = "Local",
                nearest = "No",
                rating = 3.5f,
                ratingCount = 15,
                date = "23-09-2023"
            ),
            CompareModel(
                "IPhone 14 Pro Max",
                R.drawable.walmart_logo,
                "SAR 1700",
                "Local",
                "No",
                4.0f,
                5,
                "06-07-2023"
            ),
            CompareModel(
                "IPhone 14 Pro Max",

                R.drawable.ebay_logo,
                "SAR 1200",
                "Local",
                "No",
                4.0f,
                5,
                "03-09-2023"
            ),
            CompareModel(
                "IPhone 14 Pro Max",

                R.drawable.ebay_logo,
                "SAR 1200",
                "Local",
                "No",
                4.0f,
                5,
                "03-09-2023"
            ),
        )


        // Find the RecyclerView in your layout

        val adapter = CompareAdapter(requireContext(), compareList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }
}