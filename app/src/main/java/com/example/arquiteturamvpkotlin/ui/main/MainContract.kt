package com.example.arquiteturamvpkotlin.ui.main

interface MainContract {

   interface View{

       fun mostrarMensagem(texto: String)

       fun iniciaAtividadeFrutas()
   }
    interface Presenter{

        //sera chamado qd o botao de login for clicado
        fun loginClicado(nome: String,senha: String)
    }

}