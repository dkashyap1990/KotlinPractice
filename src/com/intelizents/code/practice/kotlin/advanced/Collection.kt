package com.intelizents.code.practice.kotlin.advanced

import java.util.*

// Arrays - IntArray, DoubleArray, NullArray etc.
// List is generic - immutable by defualt
// Mutable list can be used

fun main() {
    val list= listOf(1,2,3,4,5,6)
    val list2 = intArrayOf(1,2,4,5,6)

    for((i,e) in list.withIndex()){
        println("index : $i -> value : $e")
    }

    for(num in list2.withIndex()){
        println("num : $num")
    }

    val map = TreeMap<String,Int>()
    map["Anil"]=30
    map["Swagat"]=31
    map["Vinit"]=30

    for((name,age) in map)
        println("$name -> $age")
}