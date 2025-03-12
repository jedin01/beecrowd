package org.example

fun main() {
    val times:Int = readln().toInt()
    val input:ArrayList<String> = ArrayList()
    for (i in 1..times){
        var a:String = readln()
        input.add(a)
    }
    for (a in input){
        var result:StringBuilder = StringBuilder()
        a.forEach { c: Char ->
            run {
                if (!c.isLetter()){
                    result.append((c.code).toChar())
                }else{
                    result.append((c.code + 3).toChar())
                }
            }
        }
        result.reverse()
        val a:String = result.substring(result.length/2)
        result.delete(result.length/2,result.length)
        a.forEach { c: Char ->
            run {
                result.append((c.code-1).toChar())
            }
        }

        println(result)
    }

}