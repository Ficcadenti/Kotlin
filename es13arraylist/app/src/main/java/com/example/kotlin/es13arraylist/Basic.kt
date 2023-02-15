package com.example.kotlin.es13arraylist

fun main(args : Array<String>) {
    println("Test 13 - ArrayList !!!")
    val array=ArrayList<String>()
    array.add("uno")
    array.add("due")
    array.add("tre")


    println(array)
    for(a in array)
    {
        print(" ${a}")
    }

    var arrayList:ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf()

    list.add("L1")
    list.add("L2")
    list.add("L3")

    arrayList.addAll(list)

    println("\n ${arrayList}")

    val itr=arrayList.iterator()

    while(itr.hasNext())
    {
        print(" ${itr.next()}")
    }

    println("\n ${arrayList.get(0)}")
    println(" ${arrayList.get(1)}")
    println(" ${arrayList.get(2)}")
}