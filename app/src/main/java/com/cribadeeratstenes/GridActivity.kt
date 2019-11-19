package com.cribadeeratstenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class GridActivity : AppCompatActivity() {

    lateinit var table: GridView
    private val collector : ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        elements()
        setUpView()
    }

    private fun elements(){
        for(num in 1..100){
            collector.add(num)
        }
    }

    private fun setUpView(){
        table = findViewById(R.id.grid_Table)
        table.adapter = GridAdapter(this, collector)
    }
}
