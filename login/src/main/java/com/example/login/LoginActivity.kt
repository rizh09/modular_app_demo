package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // initializing EditText and Button
        val userName = findViewById(R.id.username) as EditText
        val passWord = findViewById(R.id.password) as EditText
        val loginBtn = findViewById(R.id.loginBtn) as Button

        loginBtn.setOnClickListener {
            if (userName.text.toString().equals("gfg") && passWord.text.toString()
                    .equals("geeksforgeeks")
            ) {
                Toast.makeText(
                    this@LoginActivity,
                    "Modular Architecture Works Fine",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
