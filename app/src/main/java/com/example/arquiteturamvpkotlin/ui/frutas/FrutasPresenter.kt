package com.example.arquiteturamvpkotlin.ui.frutas

import com.example.arquiteturamvpkotlin.model.RepositorioFrutas

class FrutasPresenter(private val view:FrutasContract.View) : FrutasContract.Presenter {

    private val repositorioFrutas = RepositorioFrutas()


    override fun getFRutas() {
        val frutas = repositorioFrutas.getFrutas()

        view.mostrarDados(frutas)

    }

}