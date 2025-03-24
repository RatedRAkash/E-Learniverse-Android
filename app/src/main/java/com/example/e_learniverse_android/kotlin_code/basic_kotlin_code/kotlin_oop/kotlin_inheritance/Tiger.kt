package com.example.e_learniverse_android.kotlin_code.basic_kotlin_code.kotlin_oop.kotlin_inheritance

// Subclass
class Tiger: Animal() {
    fun myFunction() {
        println(x) // x is now inherited from the superclass
    }

    override fun makeSound() {
        super.makeSound()
        println("Tiger is Roaring")
    }
}