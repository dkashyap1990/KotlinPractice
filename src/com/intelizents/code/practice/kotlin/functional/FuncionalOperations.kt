package com.intelizents.code.practice.kotlin.functional

fun main() {
    val list = (1..20).toList()
    list.forEach{x -> print("$x ")}
    val even = list.filter { it%2==0}
    val doubleEven = even.map { it*2}

    even.forEach{print("$it ")}
    doubleEven.forEach{print("$it ")}
}