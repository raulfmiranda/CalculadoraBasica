package com.example.raul.calculadorabasica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var firstNumber:Int? = null
    private var secondNumber:Int? = null
    private var operator:Char? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_ce.setOnClickListener { txtVisor.text = "0" }

        // TODO: Concluir lógica do botão igual
        bt_equal.setOnClickListener {
            var txtVisor = txtVisor.text.toString()
            if(isNumOpeNumFormat(txtVisor)) {
                if(txtVisor.indexOf('+') != -1) {
                    this.operator = '+'

                }
                else if(txtVisor.indexOf('-') != -1) {
                    this.operator = '-'
                }
                else if(txtVisor.indexOf('x') != -1) {
                    this.operator = 'x'
                }
                else {
                    this.operator = '/'
                }
                //txtVisor.split("+")
            }
        }
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

    fun onOperatorClicked(view: View){
        val button = view as Button
        var operator = button.text.toString()

        var visorNumber = txtVisor.text.toString().toIntOrNull()
        if(visorNumber != null) {
            firstNumber = visorNumber
            var operatorConcat = txtVisor.text.toString() + operator
            txtVisor.text = operatorConcat
        }
    }

    fun isNumOpeNumFormat(txt:String): Boolean {
        val hasOperator = txt.contains("+") || txt.contains("-") || txt.contains("x") || txt.contains("/")
        if(txt.length < 3 || !hasOperator || isOperator(txt[0]) || isOperator(txt[txt.length - 1]))
            return false

        return true
    }

    fun isOperator(ch:Char) : Boolean {
        return ch == '+' || ch == '-' || ch == 'x' || ch == '/'
    }
}
