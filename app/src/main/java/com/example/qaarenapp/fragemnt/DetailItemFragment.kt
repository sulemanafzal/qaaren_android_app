package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.qaarenapp.R
import com.example.qaarenapp.adapter.TempAdapter
import com.example.qaarenapp.databinding.FragmentDetailItemBinding
import com.google.android.material.tabs.TabLayoutMediator

class DetailItemFragment : Fragment() {

    lateinit var binding: FragmentDetailItemBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailItemBinding.inflate(layoutInflater, container, false)


        binding.toolbarbackImage.setOnClickListener {
           requireActivity().onBackPressed()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tempAdapter = TempAdapter(requireActivity())

        tempAdapter.addFragment(CompareFragment(), "Compare")
        tempAdapter.addFragment(AboutFragment(), "About")
        tempAdapter.addFragment(ReviewsFragment(), "Reviews")
        tempAdapter.addFragment(LocationFragment(), "Location")
        tempAdapter.addFragment(AlertsFragment(), "Alerts")

        binding.viewPager2.adapter = tempAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = tempAdapter.getTitle(position)
        }.attach()
    }
}