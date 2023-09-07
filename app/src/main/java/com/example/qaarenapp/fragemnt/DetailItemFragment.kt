package com.example.qaarenapp.fragemnt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
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

        // Retrieve data from arguments bundle
        val arguments = arguments
        if (arguments != null) {
            val imageHeader = arguments.getInt("imagemin")
            val productName = arguments.getString("productName")
            val ratingNumber = arguments.getString("numberRating")
            val price = arguments.getString("startToEndPrice")
            val like = arguments.getInt("like")

            // Set data to your views
            binding.tvItemName.text = productName
            binding.productImage.setImageResource(imageHeader)
            binding.tvRating.text = ratingNumber
            binding.likeLogo.setImageResource(like)
            binding.tvStartEndPrice.text = price

        }

        //back icon click
        binding.toolbarbackImage.setOnClickListener {
            requireActivity().onBackPressed()
        }

        //side image click open in main image

        val imageView1 = binding.image1
        val imageView2 = binding.image2
        val imageView3 = binding.image3
        val imageView4 = binding.image4
        val productImage = binding.productImage

        setImageViewClick(imageView1, R.drawable.iphone_pro)
        setImageViewClick(imageView2, R.drawable.i_phone)
        setImageViewClick(imageView3, R.drawable.iphone_pro_max)
        setImageViewClick(imageView4, R.drawable.apple_iphone)
        setImageViewClick(productImage, R.drawable.iphone_pro_max)

        // Set an OnClickListener for like
        binding.likeLogo.setOnClickListener {
            // Check the current image source and change it
            if (binding.likeLogo.tag == "like") {
                binding.likeLogo.setImageResource(R.drawable.like)
                binding.likeLogo.tag = "dislike"

            } else {
                binding.likeLogo.setImageResource(R.drawable.like_red)
                binding.likeLogo.tag = "like"
            }
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //tablayout

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

    private fun setImageViewClick(imageView: ImageView, imageResourceId: Int) {
        imageView.setOnClickListener {
            binding.productImage.setImageResource(imageResourceId)
        }
    }
}