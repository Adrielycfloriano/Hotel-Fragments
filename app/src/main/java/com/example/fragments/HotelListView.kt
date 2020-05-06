package com.example.fragments


interface HotelListView { //para tratar as lista de hoteis
    fun showHotels (hotels: List<Hotel>)
    fun showHotelDetails(hotel: Hotel)
}