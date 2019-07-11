package com.example.arquiteturamvpkotlin.ui.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.arquiteturamvpkotlin.R
import com.example.arquiteturamvpkotlin.ui.frutas.FrutasActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {



    private lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inicializa o presenter
        presenter = MainPresenter(this)



        idButton.setOnClickListener {

            val nome = idName.text.toString()
            val senha = idSenha.text.toString()
            presenter.loginClicado(nome, senha = senha)
        }

    }
    override fun mostrarMensagem(texto: String) {
        Toast.makeText(this,texto,Toast.LENGTH_LONG).show()

    }
    override fun iniciaAtividadeFrutas() {

        startActivity(Intent(this, FrutasActivity::class.java))
    }
}
