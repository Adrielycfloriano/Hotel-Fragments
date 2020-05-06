package com.example.fragments

class HotelListPresenter (// exibira os detalhes do hotel, pegando referencia do object e interface
    private val view: HotelListView,
    private val repositotio: HotelRepositorio
){
    fun searchHotels(term: String){// nos mostra a lista
        repositotio.search(term) {
            hotels -> view.showHotels(hotels)
        }
    }
    fun showHotelDetails(hotel: Hotel){//detalhes
        view.showHotelDetails(hotel)
    }
}