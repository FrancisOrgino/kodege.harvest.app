package com.kodego.app.inventory.app.orgino.harvest_invest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.app.inventory.app.orgino.harvest_invest.databinding.ActivityStockViewPageBinding

class StockViewPage : AppCompatActivity() {

    lateinit var binding: ActivityStockViewPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStockViewPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeButtonFromStockView.setOnClickListener {
            val intentHomeButtonFromStockView = Intent(this,MainActivity::class.java)
            startActivity(intentHomeButtonFromStockView)
        }
    }
}