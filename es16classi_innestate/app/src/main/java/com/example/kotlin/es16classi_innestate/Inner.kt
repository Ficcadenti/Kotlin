package com.example.kotlin.es16classi_innestate

class Inner {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}