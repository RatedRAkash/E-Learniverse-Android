package com.example.e_learniverse_android.kotlin_code.basic_kotlin_code

class Akash : Parent() {

    // in Kotlin there is No Need for "new" keyword to create object... We directly assign Value to the Variables to Create objects
    companion object {

        // This annotation is used to tell the compiler that the method is a static method and can also be used in Java code.
        @JvmStatic
        fun main(args: Array<String>) {
            var akash: String = "Sergio Ramos"
            println("Welcome Back to Real Madrid $Ramos ${add(2, 2)}")

            //"var" vs "val"
            //"var" --> this variable can be Re-Assigned
            //"val" --> this variable can NOT be Re-Assigned, this is Equivalent to "final" keyword of java... that's why there is a "l" in the End

            var a: Int = 100
            a = 200
            println(a)

            val b: Int = 200
        }

        fun add(a: Int, b: Int): Int {
            return a + b
        }

    }
}