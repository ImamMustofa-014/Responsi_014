package com.example.responsi_014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*

class ActivityLogin : AppCompatActivity() {

    lateinit var email : EditText
    lateinit var passw : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.editText_email)
        passw = findViewById(R.id.editText_passw)

        btn_login.setOnClickListener() {
            val intent = Intent(this, ActivityPreview::class.java)
            startActivity(intent)
        }
    }
}
