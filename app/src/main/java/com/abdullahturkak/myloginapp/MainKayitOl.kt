package com.abdullahturkak.myloginapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abdullahturkak.myloginapp.databinding.ActivityMainKayitOlBinding

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainKayitOlBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.KaydetButon.setOnClickListener {
            var kullanicibilgisi=binding.KayitKullaniciAdi.text.toString()
            var kullanıcıparola=binding.KayitSifre.text.toString()
            var SharedPreferences = this.getSharedPreferences("bilgiler", MODE_PRIVATE)
            var editor = SharedPreferences.edit()
            editor.putString("kullaniciadi","$kullanicibilgisi").apply()
            editor.putString("parola","$kullanıcıparola").apply()
            Toast.makeText(applicationContext,"Kayıt Başarılı",Toast.LENGTH_LONG).show()
            binding.KayitKullaniciAdi.text.clear()
            binding.KayitSifre.text.clear()


        }

        binding.GiriseDonButton.setOnClickListener {
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}