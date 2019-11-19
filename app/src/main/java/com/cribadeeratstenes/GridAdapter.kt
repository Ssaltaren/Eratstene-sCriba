package com.cribadeeratstenes

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.view.LayoutInflater


class GridAdapter(context: Context, arrayList: ArrayList<Int>) : BaseAdapter() {

    private var context: Context = context
    private var arrayList: ArrayList<Int> = arrayList
    lateinit var rootView : View

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(p0: Int): Any {
        return arrayList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup) : View {
        val inflater = context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            rootView = inflater.inflate(R.layout.item_grid, viewGroup, false)
            val textView =  rootView.findViewById<TextView>(R.id.number)
            val number = arrayList[position]

        loop(number)

            textView.text = "$number"

        return rootView
    }

    private fun numberOne(number: Int, rootView:View){
        if (number ==1){
            rootView.setBackgroundColor(Color.BLUE)
        }
    }

    private fun multipliesOfTwo(number: Int, rootView:View){

        if (number !=2 && number%2==0){
            rootView.setBackgroundColor(Color.RED)
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun multipliesOfThree(number: Int, rootView:View){

        if (number !=3 && number%3==0){
            rootView.setBackgroundColor(context.getColor(R.color.orange))
        }
    }

    private fun multipliesOfFive(number: Int, rootView:View){

        if (number !=5 && number%5==0){
            rootView.setBackgroundColor(Color.YELLOW)
        }
    }

    private fun multipliesOfSeven(number: Int, rootView:View){

        if (number !=7 && number%7==0){
            rootView.setBackgroundColor(Color.GREEN)
        }
    }


    private fun loop(data:Int){

        for (num in 1..100){
            numberOne(data, rootView)
            multipliesOfTwo(data, rootView)
            multipliesOfThree(data,rootView)
            multipliesOfFive(data,rootView)
            multipliesOfSeven(data,rootView)
        }
    }
}