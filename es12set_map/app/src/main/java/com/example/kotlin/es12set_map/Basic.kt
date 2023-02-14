package com.example.kotlin.es12set_map

data class Frutta(val nome:String,val prezzo:Double)

fun main(args : Array<String>) {
    println("Test 12 - Set & Map !!!")
    val frutta=setOf("Arancia","Mela","Pera","Mela")

    println(frutta.toSortedSet());

    val newFrutta=frutta.toMutableList();
    newFrutta.add("Melone")
    newFrutta.add("Fico")
    println(newFrutta);

    val giorniDellaSettimana = mapOf<Int,String>(1 to "Lunedi",2 to "Martedi", 3 to "Mercoledi",4 to "Giovedi", 5 to "Venerdi", 6 to "Sabato", 7 to "Domenica")
    println(giorniDellaSettimana)

    for (k in giorniDellaSettimana.keys)
    {
        println("${k} -> ${giorniDellaSettimana[k]}")
    }

    val mapFrutta= mapOf<String,Frutta>("f1" to Frutta("Mela",20.5), "f2" to Frutta("Pera",21.5))
    for (k in mapFrutta.keys)
    {
        println("${k} -> ${mapFrutta[k]}")
    }

    val newNappaFrutta=mapFrutta.toMutableMap()
    newNappaFrutta["f0"]=Frutta("Banana",12.5)

    for (k in newNappaFrutta.keys)
    {
        println("${k} -> ${newNappaFrutta[k]}")
    }

    println(newNappaFrutta.toSortedMap())
}
