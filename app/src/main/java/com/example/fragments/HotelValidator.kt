package com.example.fragments

class HotelValidator {
     fun validate(info: Hotel) = with(info){
         checkName(name) && checkAdress(address)
     }
    private fun checkName(name: String) = name.length in 2..20
    private fun checkAdress(address: String) = address.length in 4..80
}