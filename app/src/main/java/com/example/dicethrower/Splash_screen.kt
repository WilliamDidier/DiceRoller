package com.example.dicethrower

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val button_go = findViewById<Button>(R.id.button_go)
        button_go.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Splash_screen, MainActivity::class.java)
            startActivity(intent) })
    }
}