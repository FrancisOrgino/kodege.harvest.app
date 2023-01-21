package com.kodego.app.inventory.app.orgino.harvest_invest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kodego.app.inventory.app.orgino.harvest_invest.databinding.ActivityMainBinding
import com.kodego.app.inventory.app.orgino.harvest_invest.databinding.ActivityProfilePageBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.goToProfile.setOnClickListener {
            val intentProfilePage = Intent(this, ProfilePage::class.java)
            startActivity(intentProfilePage)
        }

        binding.checkBalance.setOnClickListener {
            val intentCheckBalancePage = Intent(this,BalancePage::class.java)
            startActivity(intentCheckBalancePage)
        }

        binding.topUp.setOnClickListener {
            val intentTopUp = Intent(this,TopUpPage::class.java)
            startActivity(intentTopUp)
        }

        binding.investButton.setOnClickListener {
            val intentInvestPage = Intent(this,InvestPage::class.java)
            startActivity(intentInvestPage)
        }
        binding.AvailableStocksButton.setOnClickListener {
            val IntentStockPage = Intent(this,StockViewPage::class.java)
            startActivity(IntentStockPage)
        }

    }

}
