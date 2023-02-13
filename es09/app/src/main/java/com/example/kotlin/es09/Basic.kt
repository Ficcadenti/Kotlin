package com.example.kotlin.es09

import java.lang.Math.floor

fun main(args : Array<String>) {
    println("Test 9 - Typecasting !!!")
    val listString:List<String> = listOf("Anne", "Karen", "Peter")
    val listAny:List<Any> = listOf("Anne", 1,355435435435434354.64564564562,"Karen", 769478327483246893, "Peter",-5)
    println(listString)
    println(listAny)

    for(value in listAny)
    {
        if(value is Int)
        {
            println("Integer: ${value}")
        }else if(value is Long)
        {
            println("Long: ${value}")
        }else if(value is Double)
        {
            println("Double: ${value} whit Floor value ${floor(value)}")
        }else if(value is Float)
        {
            println("Float: ${value} ")
        }else if(value is String)
        {
            println("String: ${value} of lenght ${value.length}")
        }else
        {
            println("Unknown type");
        }
    }

    for(value in listAny)
    {
        when(value){
            is Int -> println("Integer: ${value}")
            is Long -> println("Long: ${value}")
            is Double -> println("Double: ${value} whit Floor value ${floor(value)}")
            is Float -> println("Float: ${value} ")
            is String -> println("String: ${value} of lenght ${value.length}")
            else -> println("Unknown type");
        }
    }

    var s:Any = "Ciaone !!!"
    if(s !is String)
    {
        println("Non è una stringa")
    }else
    {
        println("'${s}'  è una stringa di lunghezza ${s.length}")
    }

    val obj: Any = 1234
    val str:String? = obj as? String
    println("${str} obj is ${obj::class.qualifiedName}")
}