package com.example.qaarenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        replaceFragment(HomeFragment())

        binding.toolbar.visibility = View.GONE
        replaceFragment(HomeFragment())

        binding.bottomNav.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.profileFragment -> replaceFragment(ProfileFragment())
                R.id.customizationFragment -> replaceFragment(CustomizationFragment())
                R.id.homeFragment -> replaceFragment(HomeFragment())
                R.id.settingFragment -> replaceFragment(SettingFragment())
                R.id.notificationFragment -> replaceFragment(NotificationsFragment())
            }
            true
        }
        binding.bottomNav.selectedItemId = R.id.homeFragment

    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout, fragment)
            .commit()

    }
}