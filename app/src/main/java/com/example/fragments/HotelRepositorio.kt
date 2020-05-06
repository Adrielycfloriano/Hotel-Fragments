package com.example.fragments

interface HotelRepositorio {
    fun save(hotel: Hotel)
    fun remove(vararg hotels: Hotel)// pode receber vários objetos
    fun hotelById (id: Long, callback: (Hotel?) -> Unit)//será chamado quando a busca pelo id for
    // concluida e não retornará nada, duvida callback
    fun search(term: String, callback: (List<Hotel>) -> Unit) // duvida callback
}
