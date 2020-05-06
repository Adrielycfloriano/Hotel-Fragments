package com.example.fragments

interface HotelFormView {
    fun showHotel(hotel: Hotel)
    fun errorInvalodHotel()
    fun errorSaveHotel()
}