package com.intelizents.code.practice.kotlin.concepts

fun main() {
    val a=10
    val b=0

    //Try as statement
    try{
        val c = a/b
    }catch (e:Exception){
        println(e.message)
    }

    // Try as expression
    val c= try{
        a/b
    }catch (e:Exception){
        b/a
    }

    println(c)
}