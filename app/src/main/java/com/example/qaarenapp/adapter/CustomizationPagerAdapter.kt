package com.example.qaarenapp.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.qaarenapp.fragemnt.CategoriesFragment
import com.example.qaarenapp.fragemnt.SourcesFragment

class CustomizationPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2 // Number of fragments you want to display
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CategoriesFragment() // Use CategoriesFragment
            1 -> SourcesFragment() // Replace with your other fragment
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}