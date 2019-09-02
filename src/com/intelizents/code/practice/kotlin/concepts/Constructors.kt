package com.intelizents.code.practice.kotlin.concepts

//class with constructors


class Student(val name: String, val roll: Int) {
    //Constructor overloading/chaining
    constructor():this("Unknown",1)
    constructor(name: String):this(name,1)

    init {
        println("Object initialization")
    }
    fun show(){
        println("Name : $name, Roll : $roll")
    }
}

fun main() {
    val std1 = Student("Anil", 2)
    println("name : ${std1.name}, roll : ${std1.roll}")

    val std2 = Student("Pintu")
    println("name : ${std2.name}, roll : ${std2.roll}")

    val std3 = Student()
    println("name : ${std3.name}, roll : ${std3.roll}")
}