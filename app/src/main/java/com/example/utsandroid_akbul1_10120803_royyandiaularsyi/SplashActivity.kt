package com.example.utsandroid_akbul1_10120803_royyandiaularsyi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.delay
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    private val splashTime: Long = 3000 // Durasi tampilan splash screen dalam milidetik (3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        // Menyesuaikan padding dengan sistem bar (status bar dan navigation bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Menggunakan Handler untuk delay
        Handler(Looper.getMainLooper()).postDelayed({
            // Setelah delay, pindah ke MainActivity
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, splashTime)
    }
}

// NIM = 10120803
// NAMA = Royyan Diaularsyi
// AKBUL1
// UTS AKB
// Kamis 06/06/2024