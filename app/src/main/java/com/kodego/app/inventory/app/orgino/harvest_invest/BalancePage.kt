package com.kodego.app.inventory.app.orgino.harvest_invest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.app.inventory.app.orgino.harvest_invest.databinding.ActivityBalancePageBinding

class BalancePage : AppCompatActivity() {

    lateinit var binding: ActivityBalancePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBalancePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeButtonBalancePage.setOnClickListener{
            val intentBalancePageToHome = Intent(this,MainActivity::class.java)
            startActivity(intentBalancePageToHome)
        }

        binding.toInvestFromBalancePage.setOnClickListener {
            val intentBalancePageToInvest = Intent(this,InvestPage::class.java)
            startActivity(intentBalancePageToInvest)
        }

        binding.toTopUpFromBalancePage.setOnClickListener {
            val intentBalancePageToTopUp = Intent(this,TopUpPage::class.java)
            startActivity(intentBalancePageToTopUp)
        }
    }
}