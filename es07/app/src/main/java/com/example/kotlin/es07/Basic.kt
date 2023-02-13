package com.example.kotlin.es07

fun main(args : Array<String>) {
    println("Test 7 - Interfaccie !!!")
    var audiA3 = Car(200.0, "Audi")
    var teslaS = MacchinaElettrica(250.0, "Tesla", 85.0)

    audiA3.drive()

    println(teslaS.drive())
    teslaS.drive(200.0)

    teslaS.brake()
}