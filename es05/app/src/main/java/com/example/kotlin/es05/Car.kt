package com.example.kotlin.es05

class Car {
    lateinit var owner: String
    var myBrand:String="BMW"
        get(){
            return field.toLowerCase();
        }

    var maxSpeed:Int=250
        get() = field
        set(v)
        {
            field=if(v>0) v else throw java.lang.IllegalArgumentException("La velocità deve essere >0")
        }

    init{
        this.owner="Frank"
    }


}


