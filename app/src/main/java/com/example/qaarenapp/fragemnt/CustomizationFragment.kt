package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.qaarenapp.adapter.CustomizationPagerAdapter
import com.example.qaarenapp.databinding.FragmentCustomizationBinding

class CustomizationFragment : Fragment() {
    lateinit var binding: FragmentCustomizationBinding
    private lateinit var viewPager: ViewPager2


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCustomizationBinding.inflate(layoutInflater, container, false)

        // Get a reference to the ViewPager2
        viewPager = binding.viewPager2

        // Create an instance of your custom adapter
        val adapter = CustomizationPagerAdapter(requireActivity() as AppCompatActivity) // Use requireActivity()

        // Set the adapter to the ViewPager2
        viewPager.adapter = adapter

        binding.btnCategory.setOnClickListener {
            viewPager.currentItem = 0 // Show the first fragment
        }

        binding.btnSources.setOnClickListener {
            viewPager.currentItem = 1 // Show the second fragment
        }
        return binding.root
    }
}