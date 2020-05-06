package com.example.fragments

import java.lang.Exception

class HotelFormPresenter(
    private val view: HotelFormView,
    private val repository: HotelRepositorio
){
    private val validator = HotelValidator()
    fun loadHotel(id: Long){
        repository.hotelById(id){hotel ->
            if (hotel != null){
                view.showHotel(hotel)
            }
        }
    }
    fun saveHotel(hotel: Hotel): Boolean{
        return if (validator.validate(hotel)){
            try {
                repository.save(hotel)
                true
            } catch (e: Exception){
                view.errorSaveHotel()
                false
            }
        } else {
            view.errorInvalodHotel()
            false
        }
    }
}