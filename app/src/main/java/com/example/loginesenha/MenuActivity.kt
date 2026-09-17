package com.example.loginesenha

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnConstraint = findViewById<Button>(R.id.btnConstraint)
        val btnRelative = findViewById<Button>(R.id.btnRelative)
        val btnTable = findViewById<Button>(R.id.btnTable)
        val btnLinear = findViewById<Button>(R.id.btnLinear)

        btnConstraint.setOnClickListener {
            startActivity(Intent(this, ConstraintActivity::class.java))
        }

        btnRelative.setOnClickListener {
            startActivity(Intent(this, RelativeActivity::class.java))
        }

        btnTable.setOnClickListener {
            startActivity(Intent(this, TableActivity::class.java))
        }

        btnLinear.setOnClickListener {
            startActivity(Intent(this, LinearActivity::class.java))
        }
    }
}