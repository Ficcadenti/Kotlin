package com.example.kotlin.es10_array

data class Frutto(val nome:String, val prezzo:Float)

fun main(args : Array<String>) {
    println("Test 10 - Array !!!")

    // val numeri:IntArray = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    //val numeri = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    val numeri = arrayOf(0,1,2,3,4,5,6,7,8,9)
    println("${numeri.contentToString()}")
    for(ele in numeri)
    {
        print(" $ele")
    }

    println();

    for(idx in 0..numeri.size-1)
    {
        print(" ${numeri[idx]}")
    }

    println();

    val frutta=arrayOf(Frutto("mela",2.5f),Frutto("Pera",3.5f))
    println("${frutta.contentToString()}")

    println();

    for(idx in frutta.indices)
    {
        println("${frutta[idx].nome} at idx=${idx}")
    }
}