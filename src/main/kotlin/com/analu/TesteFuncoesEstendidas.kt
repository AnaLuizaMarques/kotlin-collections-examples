package com.analu

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("____________________")
    println(salarios.somatoria())

    println("____________________")
    println(salarios.media())
}