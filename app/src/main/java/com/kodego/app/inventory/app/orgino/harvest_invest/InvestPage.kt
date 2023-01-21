package com.kodego.app.inventory.app.orgino.harvest_invest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.app.inventory.app.orgino.harvest_invest.databinding.ActivityInvestPageBinding

class InvestPage : AppCompatActivity() {

    lateinit var binding: ActivityInvestPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInvestPageBinding. inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeButtonFromInvestPage.setOnClickListener{
            val intentHomeButtonFromInvestPage = Intent(this,MainActivity::class.java)
            startActivity(intentHomeButtonFromInvestPage)
        }
    }
}