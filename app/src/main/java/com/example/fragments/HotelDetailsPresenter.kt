package com.example.fragments

class HotelDetailsPresenter(
    private val view: HotelDetailsView,
    private val repository: HotelRepositorio
){
    fun loadHotelDetails(id: Long){
        repository.hotelById(id){hotel ->
            if (hotel != null){
                view.showHotelDetails(hotel)
            } else{
                view.errorHotelNotFound()
            }
        }
    }
}