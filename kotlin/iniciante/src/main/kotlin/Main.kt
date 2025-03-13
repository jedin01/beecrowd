package org.example

import kotlin.math.pow

fun main() {
    var r:Double  = readln().toDouble()
    val a:Double = Math.PI*(r.pow(2))
    println(String.format("A=%.4f", a))

}