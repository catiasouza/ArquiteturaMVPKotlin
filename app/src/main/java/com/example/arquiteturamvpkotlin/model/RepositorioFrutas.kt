package com.example.arquiteturamvpkotlin.model

class RepositorioFrutas {

    private val frutas = arrayOf(
        "Banana",
        "Manga",
        "Pessego",
        "Laranja",
        "Uva"
    )
    fun getFrutas():Array<String>{
        return frutas
    }
}