package com.kodego.app.inventory.app.orgino.harvest_invest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.app.inventory.app.orgino.harvest_invest.databinding.ActivityTopUpPageBinding

class TopUpPage : AppCompatActivity() {

    lateinit var binding: ActivityTopUpPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopUpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gCashButton.setOnClickListener {
            val intentGCash = Intent(this,GcashPage::class.java)
            startActivity(intentGCash)
        }
        binding.sevenElevenButton.setOnClickListener {
            val intentSevenEleven = Intent(this,SevenElevenPage::class.java)
            startActivity(intentSevenEleven)
        }

        binding.homeButtonFromTopUp.setOnClickListener{
            val intentHomeButtonFromTopUp = Intent(this,MainActivity::class.java)
            startActivity(intentHomeButtonFromTopUp)
        }
    }
}