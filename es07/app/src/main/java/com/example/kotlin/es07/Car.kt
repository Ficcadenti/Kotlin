package com.example.kotlin.es07

open class Car(override val maxSpeed: Double,open val brandName: String): Drivable{

    // open so it can be overriden by inhereting classes
    open var range: Double = 0.0

    open fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }

    }

    override fun drive(): String {
        println("Drove for $range Km")
        return range.toString()
    }

    // overridden functions are implicitly open:
    override fun brake() {
        println("The car is breaking")
    }

}