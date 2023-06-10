package com.example.gpagod

interface Calc {
    fun avg() : String

    class Gpa (
        private val number : String)
        : Calc {
        override fun avg(): String {
            val arrOfInt= number.map {"$it".toInt()}
            return (arrOfInt.average()).toString()
        }
    }
}