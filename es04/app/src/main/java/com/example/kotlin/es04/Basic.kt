package com.example.kotlin.es04

fun main()
{
    var a:Int=10
    var b:Int=20

    println("Somma(${a},${b})=${add(a,b)}")

    var name:String="Raffaele"
    var nameNull:String?="Test"

    if(nameNull!=null) {
        var len: Int = nameNull.length;
    }

    var len:Int? =nameNull?.length?:-1;
    println("Lunghezza ${len}")

    nameNull?.let{ println("Lunghezza ${it.length}")}

    name=nameNull?:"Fantasma"

    println("Nome = ${name}")

    nameNull!!.toLowerCase()

}

fun add(a:Int, b:Int):Int
{
    return a+b
}