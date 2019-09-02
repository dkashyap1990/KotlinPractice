package com.intelizents.code.practice.kotlin.concepts

// When works as Switch case statenent
// It works as both statement and expression


fun main() {
    val intVal=0

    val retVal= when(intVal){
        1 -> println("One")
        2 -> println("Two")
        else -> println("Others")
    }

    println(retVal)
}