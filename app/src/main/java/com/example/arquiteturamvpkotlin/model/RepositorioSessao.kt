package com.example.arquiteturamvpkotlin.model

class RepositorioSessao {

    val nome = "aula"
    val senha = "1234"

    fun login(mNome: String, sSenha : String): Boolean{

        return mNome == nome && sSenha == senha

    }
}