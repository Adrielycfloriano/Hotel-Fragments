package com.example.fragments

data class Hotel( // amarzenando dados
    var id: Long,
    var name: String = "",
    var address: String = "",
    var rating: Float = 0.0F
){
    override fun toString(): String = name //poder visualizar o nome do hotel na listView
}