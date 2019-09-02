package com.intelizents.code.practice.kotlin.functional

interface Tester {
    fun test()
}

fun main() {
    val tester: Tester = object :
        Tester {
        override fun test() {
            println("Testing is going on....")
        }
    }
    tester.test()
}