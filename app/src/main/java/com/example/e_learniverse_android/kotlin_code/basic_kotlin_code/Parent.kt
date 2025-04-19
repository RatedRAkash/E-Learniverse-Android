package com.example.e_learniverse_android.kotlin_code.basic_kotlin_code

// By Default classes are "final" in Kotlin... That's why we CAN NOT inherit them, that's why we use "open" Keyword to Open the Class
open class Parent{

    // companion object == "static" Keyword in Java
    companion object {
        var Ramos: String = "Sergio Ramos";
    }
}