package com.intelizents.code.practice.kotlin.functional


//Data enables class to define toString, equalTo, hashCode, copy automatically
//Similar to case class in Scala
data class Emp(val name:String,val id:Int){}

fun main() {
    val emp1= Emp("abc", 10)
    val emp2= Emp("abc", 10)
    val emp3=emp1.copy()
    val emp4=emp2.copy(id=20)

    println(emp1==emp2)
    println(emp3.toString())
    println(emp4)
}


