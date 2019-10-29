package com.example.responsi_014

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_preview.*

class ActivityPreview : AppCompatActivity() {

    lateinit var hslnm : TextView
    lateinit var hslalmt : TextView
    lateinit var hsllhr : TextView
    lateinit var btnpre : Button
    @SuppressLint("", "SetTextI18n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        hslnm = findViewById(R.id.hasil_nama)
        hslalmt = findViewById(R.id.hasil_alamat)
        hsllhr = findViewById(R.id.hasil_lahir)
        btnpre = findViewById(R.id.btn_simpan)

        hslnm.setText(intent.getStringExtra("dataNama"))
        hslalmt.setText(intent.getStringExtra("dataAlamat"))
        hsllhr.setText(intent.getStringExtra("dataTempatlahir"))

        btn_simpan.setOnClickListener() {
            val intent = Intent(this@ActivityPreview,ActivityLogin::class.java)
            startActivity(intent)
        }
    }
}
