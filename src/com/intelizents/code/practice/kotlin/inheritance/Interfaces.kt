package com.intelizents.code.practice.kotlin.inheritance

interface A {
    fun show()
    fun abc() {
        println("Inside abc() from A")
    }
}

interface B {
    fun display()
    fun abc() {
        println("Inside abc() from B")
    }
}

class C : A, B {
    override fun show() {
        println("Inside show method")
    }

    override fun display() {
        println("Inside display method")
    }

    override fun abc() {
        println("Inside abc() from C")
    }
}

fun main() {
    val obj = C()
    obj.show()
    obj.display()
    obj.abc()
}