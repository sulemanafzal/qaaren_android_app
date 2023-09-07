package com.example.qaarenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.qaarenapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.btnSignin.setOnClickListener {
        val intent = Intent(this@SignInActivity, MainActivity::class.java)
        startActivity(intent)
    }
    }
}