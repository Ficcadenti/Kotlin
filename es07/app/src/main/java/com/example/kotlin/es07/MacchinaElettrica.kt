package com.example.kotlin.es07

class MacchinaElettrica(override val maxSpeed: Double,
                        override val brandName: String,
                        batteryLife: Double) : Car(maxSpeed, brandName) {
    // in KM
    override var range = batteryLife/6

    override fun drive() = "Overriding the drive of my Car"

    fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
    
    override fun brake(){
        super.brake()
        println("The electirc car is breaking")
    }
}