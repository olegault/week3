package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Define variables:
    private lateinit var loginButton: Button
    private lateinit var username: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assign variables:
        loginButton = findViewById(R.id.loginButton)
        username = findViewById(R.id.userNameInput)
        password = findViewById(R.id.passwordInput)

        // Button clicked -> Go to Second page (only if username & password is not empty)
        loginButton.setOnClickListener {
            val user: String = username.text.toString()
            val pass: String = password.text.toString()
            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(applicationContext, "Please type in both username & password!", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("username", user)
                startActivity(intent)
            }
        }
    }
}