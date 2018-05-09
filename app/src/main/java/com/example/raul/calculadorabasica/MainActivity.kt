package com.example.raul.calculadorabasica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var firstNumber = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_ce.setOnClickListener { txtVisor.text = "0" }
    }

    fun onNumberClicked(view: View){
        val button = view as Button
        var number = button.text.toString()

        if(txtVisor.text == "0") {
            txtVisor.text = number
        }
        else {
            var numberConcat = txtVisor.text.toString() + number
            txtVisor.text = numberConcat
        }
    }

}
