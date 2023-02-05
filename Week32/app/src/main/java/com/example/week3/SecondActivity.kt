package com.example.week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var msg: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Changing the banner title
        this.title = "Welcome!"

        // Assign value to variable
        msg = findViewById(R.id.helloMsg)

        // Get the username passed from first page:
        val username: String? = intent.extras?.getString("username")

        // Change the text of "Hello ..." to include the username
        val helloMSG: String = msg.text.toString() + " " + username + "!"
        msg.text = helloMSG
    }
}