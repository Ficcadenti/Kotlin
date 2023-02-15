package com.example.kotlin.es17cast

fun main(args : Array<String>) {
    println("Test 17 - Cast sicuri e non sicuri !!!")

    val location:Any="Roma"
    val b2:String?=location as? String
    val b3:Int?=location as? Int

    println("${b2}")
    println("${b3}")

    val a1:Any?=null
    val b1:String?=a1 as String?
    println(b1)

    val c:Int = 123;
    val d:String = c as String

    val a:Any?=null
    val b:String=a as String

    println(b)
}