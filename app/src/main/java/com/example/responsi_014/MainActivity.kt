package com.example.responsi_014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var nm : EditText
    lateinit var almt : EditText
    lateinit var lhr : EditText
    lateinit var btnreg : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nm = findViewById(R.id.editText_nama)
        almt = findViewById(R.id.editText_alamat)
        lhr = findViewById(R.id.editText_lahir)
        btnreg = findViewById(R.id.btn_daftar)

        // mengirim data ke activity preview
        btn_daftar.setOnClickListener(){
            val intent = Intent(this, ActivityPreview::class.java)

            intent.putExtra("dataNama", nm.text.toString())
            intent.putExtra("dataAlamat", almt.text.toString())
            intent.putExtra("dataTempatlahir", lhr.text.toString())

            startActivity(intent)
        }
    }
}
