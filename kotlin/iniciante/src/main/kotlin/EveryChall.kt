package org.example

import java.lang.reflect.Array
import kotlin.math.pow

class EveryChall {

    fun print():Unit{
        print("Hello, Wolrd!")
    }
    fun sum():Unit{
        val a: Int = readln().toInt()
        val b: Int = readln().toInt()
        val x: Int = a+b
        println("X = "+x)
    }
    fun encrypt():Unit{
        fun main() {
            val times = readln().toInt()
            val input = ArrayList<String>()

            for (i in 1..times) {
                val line = readln()
                input.add(line)
            }

            for (original in input) {
                val result = StringBuilder()

                original.forEach { c ->
                    if (c.isLetter()) {
                        result.append((c.code + 3).toChar())
                    } else {
                        result.append(c)
                    }
                }

                result.reverse()

                val mid = result.length / 2
                for (i in mid until result.length) {
                    result.setCharAt(i, (result[i].code - 1).toChar())
                }
                println(result.toString())
            }
        }
    }
    fun calcArea(){
        var r:Double  = readln().toDouble()
        val a:Double = Math.PI*(r.pow(2))
        println(String.format("A=%.4f", a))

    }
}