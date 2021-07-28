package com.analu

fun main(){
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("_________________")
    values.sort()
    values.forEach {
        println(it)
    }
}

