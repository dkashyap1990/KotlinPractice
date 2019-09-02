package com.intelizents.code.practice.kotlin.concepts

fun main() {
    val ascRange = 1..10
    val dscRange = 10 downTo 1
    val nos = 1 until 16

    for (num in ascRange)
        print("$num ")

    println()
    for (num in dscRange)
        print("$num ")

    println()
    for (num in nos)
        print("$num ")
}