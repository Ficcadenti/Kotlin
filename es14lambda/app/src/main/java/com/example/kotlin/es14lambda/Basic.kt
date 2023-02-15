package com.example.kotlin.es14lambda

fun main(args : Array<String>) {
    println("Test 14 - Lambda !!!")
    println("${addNumber(2,3)}")

    val sum:(Int,Int)  -> Int={ a:Int,b:Int->a+b}
    println("${sum(2,3)}")
    val sum2 = {a:Int, b:Int -> a+b}
    println("${sum2(2,3)}")

}

fun addNumber(a:Int,b:Int):Int
{
    return a+b;
}