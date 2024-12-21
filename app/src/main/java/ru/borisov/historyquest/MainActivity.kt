package ru.borisov.historyquest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var startBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startBTN = findViewById(R.id.startBTN)
        startBTN.setOnClickListener {
            startActivity(Intent(this@MainActivity, QuestionActivity::class.java))
        }
    }
}