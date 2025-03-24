package com.example.e_learniverse_android.kotlin_code.basic_kotlin_code.kotlin_oop.kotlin_interface

interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start()
    {
        println("Car started")
    }

    override fun stop()
    {
        println("Car stopped")
    }
}

fun main() {
    val obj = Car()
    obj.start()
    obj.stop()
}
