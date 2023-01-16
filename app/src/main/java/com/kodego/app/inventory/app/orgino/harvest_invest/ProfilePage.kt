package com.kodego.app.inventory.app.orgino.harvest_invest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.app.inventory.app.orgino.harvest_invest.databinding.ActivityProfilePageBinding

class ProfilePage : AppCompatActivity() {
    lateinit var binding: ActivityProfilePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}