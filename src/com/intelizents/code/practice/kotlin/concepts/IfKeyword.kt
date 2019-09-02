package com.intelizents.code.practice.kotlin.concepts

// If else works as conditional and expression

fun main() {
    var name:String?=null;
    val greet="Welcome"
    val stmt ="! Kotlin is fun"

    // if as expression
    name = if (!name.isNullOrEmpty()) name else "Guest"

    println("$greet $name $stmt")
}