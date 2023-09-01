package com.example.qaarenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.example.qaarenapp.databinding.ActivityMainBinding
import com.example.qaarenapp.fragemnt.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var seekBarLayout: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Automatically select HomeFragment at app launch
        if (savedInstanceState == null) {
            replaceFragment(HomeFragment())
            binding.bottomNav.selectedItemId = R.id.homeFragment
        }


        replaceFragment(HomeFragment())

        binding.toolbar.visibility = View.GONE
        replaceFragment(HomeFragment())

        binding.bottomNav.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.profileFragment -> replaceFragment(ProfileFragment())
                R.id.categoryFragment -> replaceFragment(CategoriesFragment())
                R.id.homeFragment -> replaceFragment(HomeFragment())
                R.id.settingFragment -> replaceFragment(SettingFragment())
                R.id.notificationFragment -> replaceFragment(NotificationsFragment())
            }
            true
        }
        replaceFragment(HomeFragment())


    }

    private fun showSeekBarLayout() {

    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout, fragment)
            .commit()

    }
}