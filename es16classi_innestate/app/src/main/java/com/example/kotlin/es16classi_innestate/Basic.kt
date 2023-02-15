package com.example.kotlin.es16classi_innestate

fun main(args : Array<String>) {
    println("Test 16 - Classi innestate !!!")

    val outer = Outer.Nested().foo() // == 2

    println("${outer}")

    //val inner = Inner().Nested().foo() // == 2
    //println("${inner}")

    var obj=Inner().Inner()
    println("${obj.foo()}")
}
