package com.something.cwchoroscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class count : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        //Home Button being set
        val homeBtn = findViewById<Button>(R.id.homeBtn)
        //Home Button handler
        homeBtn.setOnClickListener {
            //Kill activity.
            finish()
        }
    }
}
