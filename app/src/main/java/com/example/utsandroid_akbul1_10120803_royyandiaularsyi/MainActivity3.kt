package com.example.utsandroid_akbul1_10120803_royyandiaularsyi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val buttonSubmit = findViewById<Button>(R.id.selanjutnyaSubmit)

        buttonSubmit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

// NIM = 10120803
// NAMA = Royyan Diaularsyi
// AKBUL1
// UTS AKB
// Kamis 06/06/2024