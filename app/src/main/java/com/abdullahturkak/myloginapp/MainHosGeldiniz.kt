package com.abdullahturkak.myloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdullahturkak.myloginapp.databinding.ActivityMainBinding
import com.abdullahturkak.myloginapp.databinding.ActivityMainHosGeldinizBinding

class MainHosGeldiniz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding= ActivityMainHosGeldinizBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.CikisButton.setOnClickListener {
            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}