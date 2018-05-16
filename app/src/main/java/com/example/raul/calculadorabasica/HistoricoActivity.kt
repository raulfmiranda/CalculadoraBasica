package com.example.raul.calculadorabasica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_historico.*

class HistoricoActivity : AppCompatActivity() {
    val contas: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico)

        addContas()
        rv_contas.layoutManager = LinearLayoutManager(this)
        rv_contas.adapter = ContaAdapter(contas, this)

        var actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }

    fun addContas() {
        contas.add("5 x 5 = 25")
        contas.add("2 + 3 = 5")
        contas.add("7 - 8 = -1")
    }
}
