//This will rename the class to FunClass
@file:JvmName("FunClass")

package com.intelizents.code.practice.kotlin.concepts

import java.math.BigInteger

fun main() {
    val a = 10
    val b = 20
    println("$a + $b = " + add(a, b))
    println("$a / $b = " + div(a, b))

    calAmount(100.0)
    calAmount(100.0,5.0)

    //Named parameters
    calAmount(intRate = 3.0,cap = 200.00)

    val num=BigInteger("700")
   // println("fact($num) -> "+ fact(num))

    val num2=BigInteger("700")
    println("fact($num) -> "+ factTR(num2,BigInteger.ONE))
}

//Function call
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

//Anonymous function call
fun div(num1: Int, num2: Int): Int = num1 / num2
fun max(num1: Int, num2: Int): Int = Integer.max(num1, num2)

//If the same code is called by Java code,
// then it will create overloaded methods in runtime
@JvmOverloads
//Default parameter
fun calAmount(cap:Double,intRate:Double=4.0){
    println("Captial : "+cap)
    println("Interest rate : "+intRate)
    println("Principle : "+cap*(1+ intRate/100))
}

//recursion
fun fact(num:BigInteger):BigInteger{
    when(num){
        BigInteger.ONE -> return BigInteger.ONE
        else -> return num* fact(num-BigInteger.ONE)
    }
}

//tail recursion
tailrec fun factTR(num:BigInteger,result : BigInteger):BigInteger{
    when(num){
        BigInteger.ONE -> return BigInteger.ONE
        else -> return num* factTR(num-BigInteger.ONE, (num*result))
    }
}