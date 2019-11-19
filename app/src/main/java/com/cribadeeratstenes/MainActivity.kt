package com.cribadeeratstenes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var startbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUp()
    }

    private fun setUp(){
        startbutton = startCribaButton
        startbutton.setOnClickListener {
            val intent = Intent(this, GridActivity::class.java)
            startActivity(intent)
        }
    }
}
