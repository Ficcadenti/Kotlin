package com.example.kotlin.es06

fun main(args : Array<String>) {
    println("Test 6 !!!")
    var c1:Car=Car("A3","Audi")
    var c2:MacchinaElettrica=MacchinaElettrica("500","Fiat", 85.0)
    c1.guida(200.0)
    c2.guida(150.0)

    c2.guida(1000.0)
    c2.guida()
}