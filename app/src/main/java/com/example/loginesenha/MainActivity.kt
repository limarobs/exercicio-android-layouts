package com.example.loginesenha

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate chamado")

        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            Log.d(TAG, "Botão Login clicado")

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy chamado")
    }
}