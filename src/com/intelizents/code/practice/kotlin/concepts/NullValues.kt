package com.intelizents.code.practice.kotlin.concepts

fun main() {
    var fname="John"
    var lname:String?="Sina"

    println("$fname $lname")

    lname=null
    println("$fname $lname")
    //null value handling --
    //no null pointer exception
    println("${fname.length} ${lname?.length}")
}