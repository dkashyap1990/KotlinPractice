package com.intelizents.code.practice.kotlin.advanced

class ClassA private constructor(){
    companion object{
        private val INSTANCE= ClassA();
        fun createInstance(): ClassA =
            INSTANCE
    }

    fun show(){
        println("Inside show function")
    }
}

fun main() {
    var obj = ClassA.createInstance()
    println(obj)
    obj = ClassA.createInstance()
    println(obj)
    obj.show()
}