package com.example.e_learniverse_android.kotlin_code.basic_kotlin_code.kotlin_oop.kotlin_inheritance

// Superclass
// By Default classes are "final" in Kotlin... That's why we CAN NOT inherit them, that's why we use "open" Keyword to Open the Class
open class Animal {
    val x = 5

    // Also, to override we also have to "open" the Functions also
    open fun makeSound(){
        println("Animal is making Sound");
    }
}