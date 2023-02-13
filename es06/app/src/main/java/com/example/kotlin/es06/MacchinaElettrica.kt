package com.example.kotlin.es06

class MacchinaElettrica(name:String, brand: String, val batteryLife:Double) : Car(name,brand) {
    override var range: Double=batteryLife*6

    override fun guida(distanza:Double)
    {
        println("Ho guidato la ${name} per ${distanza} Km")
    }

    fun guida()
    {
        println("Ho guidato la macchina elettrica ${name} per ${range} Km")
    }
}