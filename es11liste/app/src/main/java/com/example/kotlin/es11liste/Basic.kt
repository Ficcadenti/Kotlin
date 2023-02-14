package com.example.kotlin.es11liste

fun main(args : Array<String>) {
    println("Test 11 - Liste !!!")
    val mesi = listOf("Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre")
    val anyTypes = listOf(1,2,3,true,"Ciaone !!!")
    println(mesi)
    println(anyTypes.size)

    for(mese in mesi)
    {
        println(mese)
    }
    val addAnyTypes=anyTypes.toMutableList();
    val arrayElement=arrayOf(5,6,"Valeria");
    addAnyTypes.add("Raffaele")
    addAnyTypes.addAll(arrayElement);

    println(addAnyTypes)

    val alfabeto= mutableListOf<String>("A","B","C","D","E","F","G","H","I","L","M","N","O","P","Q","R","S","T","U","V","Z")
    alfabeto[3]="d"
    val vocali= mutableListOf<String>("A","E","I","O","U")
    alfabeto.removeAll(vocali)
    println(alfabeto)
    println(vocali)
}