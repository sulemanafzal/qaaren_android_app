package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.qaarenapp.model.HomeItemMode
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.HomeItemAdapter
import com.example.qaarenapp.adapter.TempAdapter
import com.example.qaarenapp.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

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

        val tempAdapter = TempAdapter(requireActivity())


        tempAdapter.addFragment(AllFragment(), "All")
        tempAdapter.addFragment(HomeCategoryFragment(), "Home")
        tempAdapter.addFragment(ElectronicsFragment(), "Electronics")
        tempAdapter.addFragment(GroceryFragment(), "Grocery")
        tempAdapter.addFragment(ClothsFragment(), "Cloths")
        tempAdapter.addFragment(EntertainmentFragment(), "Entertainment")
        tempAdapter.addFragment(GamingFragment(), "Gaming")
        tempAdapter.addFragment(ToysFragment(), "Toys")
        tempAdapter.addFragment(PhotographyFragment(), "Photography")
        tempAdapter.addFragment(WearablesFragment(), "Wearables")


        binding.viewPager2.adapter = tempAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = tempAdapter.getTitle(position)
        }.attach()
    }
}