package com.example.utsandroid_akbul1_10120803_royyandiaularsyi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nim = intent.getStringExtra("NIM")
        val nameView = intent.getStringExtra("NAME")
        val tglView = intent.getStringExtra("Tanggal Lahir")
        val jkView = intent.getStringExtra("Jenis Kelamin")
        val hubview = intent.getStringExtra("Hubungan Dengan Anda")

        val nimTextView = findViewById<TextView>(R.id.nimText)
        val nameTextView = findViewById<TextView>(R.id.nameText)
        val tglTextView = findViewById<TextView>(R.id.tglText)

        val lakiTextView = findViewById<TextView>(R.id.lakiButton)
        val perempuanTextView = findViewById<TextView>(R.id.perempuanButton)

        val otTextView = findViewById<TextView>(R.id.otButton)
        val suamiTextView = findViewById<TextView>(R.id.suamiButton)
        val anakTextView = findViewById<TextView>(R.id.anakButton)
        val kerabatTextView = findViewById<TextView>(R.id.kerabatButton)
        val buttonNext = findViewById<Button>(R.id.selanjutnyaSubmit)

        nimTextView.text = nim
        nameTextView.text = nameView
        tglTextView.text = tglView


        buttonNext.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}

// NIM = 10120803
// NAMA = Royyan Diaularsyi
// AKBUL1
// UTS AKB
// Kamis 06/06/2024