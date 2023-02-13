package com.example.kotlin.es05

data class User(var id:Int, var name: String)
{
    fun test()
    {
        println("Test $name")
    }
}
fun main(args : Array<String>) {
    val u:User=User(1,"Raffaele")
    u.name="Luca"
    u.test()

    val u2:User=User(1,"Luca")

    println(u==u2)

    println("$u")

    val u3:User=u2.copy(name = "Gabriele")
    println("$u3")
    println(u3.component1())
    println(u3.component2())

    var(i,n)=u3
    println("$i")
    println("$n")

   var t:Test=Test(1,2)

    println("$t")
}