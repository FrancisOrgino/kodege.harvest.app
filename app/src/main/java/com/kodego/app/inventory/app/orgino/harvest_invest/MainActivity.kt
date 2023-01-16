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

        val goToProfileButton = findViewById<Button>(R.id.GoToProfile)
        goToProfileButton.setOnClickListener {
            val intentProfilePage = Intent(this, ProfilePage::class.java)
            startActivity(intentProfilePage)
        }
        val goToCheckBalancePage = findViewById<Button>(R.id.checkBalance)
        goToCheckBalancePage.setOnClickListener {
            val intentCheckBalancePage = Intent(this,goToCheckBalancePage::class.java)
            startActivity(intentCheckBalancePage)

        }
    }

}
