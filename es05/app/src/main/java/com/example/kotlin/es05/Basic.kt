package com.example.kotlin.es05


// Hello World Program

fun main(args : Array<String>) {

    var persona: Persona=Persona("Raffaele","Ficcadenti")
    var test: Persona=Persona();
    var testCognome: Persona=Persona(cognome = "Ficcadenti");
    var gabriele:Persona=Persona("Gabriele","Ficcadenti",8)

    persona.stateHobby()

    var car:Car=Car()
    car.owner
    car.maxSpeed=20
    println("${car.myBrand}")
    println("${car.maxSpeed}")


    var a:Int=1;
    println("${a}");
    myFun(a);
    println("${a}");

}

fun myFun(a:Int)
{
    var a:Int=10;
    println("${a}");
}