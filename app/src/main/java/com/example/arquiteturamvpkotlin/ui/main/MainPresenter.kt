package com.example.arquiteturamvpkotlin.ui.main

import com.example.arquiteturamvpkotlin.model.RepositorioSessao

class MainPresenter(private  val view: MainContract.View) : MainContract.Presenter {

    private lateinit var repositorioSessao: RepositorioSessao

    init {
        repositorioSessao = RepositorioSessao()
    }

    override fun loginClicado(nome: String, senha: String) {

        if (nome.isEmpty()){
            view.mostrarMensagem("Nome invalido")
            return

        }
        if (senha.isEmpty()){
            view.mostrarMensagem("Senha Incorreta")
            return
        }
        //-----------
        val loginSucesso = repositorioSessao.login(nome, senha)

        if (loginSucesso){
        view.mostrarMensagem("Login Efetuado")
            view.iniciaAtividadeFrutas()
    }else {
            view.mostrarMensagem("Falha no login")
        }
        }
}