package com.example.kotlin.es18eccezioni

fun main(args : Array<String>) {
    println("Test 18 - Eccezioni !!!")

    var x:Int? = getNumber("10x")
    println(x)

    validate(1)


}

fun getNumber(str:String):Int?{
    return try{
        Integer.parseInt(str)
    }catch(e:java.lang.NumberFormatException)
    {
        e.printStackTrace()
        null
    }
    finally {
        println("Codice sempre esguito !!!!!!")
    }
}

fun validate(age:Int)
{
    if(age<18)
        throw ArithmeticException("Eta inferiore ai 18 anni")
    else
        println("OK !!!!")
}