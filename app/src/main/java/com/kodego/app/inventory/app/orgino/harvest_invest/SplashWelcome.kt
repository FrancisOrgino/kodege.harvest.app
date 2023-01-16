package com.kodego.app.inventory.app.orgino.harvest_invest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashWelcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_welcome)

        CoroutineScope(Dispatchers.Main).launch {
            delay(3000L)
            startActivity(Intent(this@SplashWelcome, MainActivity::class.java))
            finish()
        }

    }

}