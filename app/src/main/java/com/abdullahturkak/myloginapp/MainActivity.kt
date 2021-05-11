package com.abdullahturkak.myloginapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import com.abdullahturkak.myloginapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        preferences = getSharedPreferences("bilgiler.xml", MODE_PRIVATE)



         binding.GirisButton.setOnClickListener {
             var kayitliKullanici = preferences.getString("kullaniciadi","")
             var kayitliparola = preferences.getString("parola","")
             var giriskullanici=binding.KullaniciAdi.text.toString()
             var girisParola=binding.Sifre.text.toString()

             if ((kayitliKullanici==giriskullanici)&&(kayitliparola==girisParola)){
                 intent= Intent(applicationContext,MainHosGeldiniz::class.java)
                 startActivity(intent)
             }else{
                 Toast.makeText(applicationContext, "Giriş Bilgileri Hatalı", Toast.LENGTH_LONG).show()
             }

         }

         binding.KayitButton.setOnClickListener {
             intent= Intent(applicationContext,MainKayitOl::class.java)
             startActivity(intent)
         }


    }


}