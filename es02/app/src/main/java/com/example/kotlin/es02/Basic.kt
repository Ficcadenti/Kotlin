package com.example.kotlin.es02

// Hello World Program

fun main(args : Array<String>) {
    var myString:String="Ciao Mondo !!!!"

    println("myString=$myString La lunghezza è: ${myString.length}")

    println("Comparazione ${5>30}")

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    var giornoSettimana:Int=11
    var s=when(giornoSettimana)
    {
        1-> "Lunedi"
        2-> "Martedi"
        3-> "Mercoledi"
        4-> "Giovedi"
        5-> "Venerdi"
        6-> "Sabatao"
        7-> "Domenica"
        else -> "Indefinito"
    }

    println("Giorno della settimana ${giornoSettimana}=${s}")

    val x : Any = 13.37F
    //assign when to a variable
    val result2 =  when(x) {
    //let condition for each block be only a string
        is Float -> "is an Float"
        is Int -> "is an Int"
        is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    print("$x $result2")

    for(num in 1..10)
    {
        println("num=${num}")
    }

    for(num in 1 until 10)
    {
        println("num=${num}")
    }
}