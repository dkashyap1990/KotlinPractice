package com.intelizents.code.practice.kotlin.functional

// Replacement of Static object
class MyClass{
    companion object{
        fun show(){
            println("Inside companion object method")
        }
    }
}

fun main() {
    MyClass.show()
}