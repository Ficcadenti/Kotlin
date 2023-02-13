package com.example.kotlin.es05


class Persona (nome: String="Test", cognome: String="Test") {
    private var eta:Int?=null;
    private var hobby:String="Fresare"
    private var nome: String?=null;
    private var cognome: String?=null;

    init{
        this.nome=nome
        this.cognome=cognome
        println("La persona è stata creata !!!");
        println("Nome = ${this.nome}")
        println("Cognome = ${this.cognome}")
    }

    constructor(nome: String, cognome: String, eta:Int):this(nome,cognome)
    {
        this.eta=eta;
    }

    public fun stateHobby()
    {
        println("l'hobby di ${cognome},${nome} è \"${hobby}\"")
    }

    override fun toString(): String {
        return "Persona(eta=$eta, hobby='$hobby')"
    }
}
