package com.intelizents.code.practice.kotlin.concepts


//class with setter/getter
class Coder {
    var skill: String? = null

    fun show() {
        println("Skill : $skill")
    }
}

fun main() {
    val coder1 = Coder()
    coder1.skill = "Python"
    coder1.show()

    val coder2 = Coder()
    coder2.skill = "Java"
    coder2.show()

    val coder3 = coder1.plus(coder2)
    coder3.show()

    val coder4 = coder1 + coder2
    coder4.show()
}

//extension funcion(only takes single parameter) with operator overloading
operator infix fun Coder.plus(c: Coder): Coder {
    val coder = Coder()
    coder.skill = this.skill + ", " + c.skill
    return coder
}