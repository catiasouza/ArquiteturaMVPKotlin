package com.example.arquiteturamvpkotlin.ui.frutas

interface FrutasContract {

    interface View{

        fun mostrarDados(frutas:Array<String>)
    }
    interface Presenter{
     fun getFRutas()
    }

}