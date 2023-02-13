package com.example.kotlin.es06

open class Car(val name:String, val brand: String) : Veicolo() {

    open var range:Double=0.0

    fun extendRange(v:Double)
    {
        this.range+=v

    }

    open fun guida(distanza:Double)
    {
        println("Ho guidato la ${name} per ${distanza} Km")
    }
}