package com.example.arquiteturamvpkotlin.ui.frutas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.arquiteturamvpkotlin.R

class FrutasActivity : AppCompatActivity(), FrutasContract.View{


    private lateinit var presenter: FrutasPresenter

    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        //iniciar presenter
        presenter = FrutasPresenter(this)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
        android.R.id.text1, arrayListOf() )



        val lista = findViewById<ListView>(R.id.idListaFrutas)
        lista.adapter = adapter

        //carregar as frutas
        presenter.getFRutas()

    }
    override fun mostrarDados(frutas: Array<String>) {
        adapter.addAll(frutas.toMutableList())
    }
}
