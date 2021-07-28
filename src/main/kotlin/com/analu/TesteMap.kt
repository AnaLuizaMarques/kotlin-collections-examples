package com.analu

fun main(){
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1= mapOf(pair)

    map1.forEach { ( k, v) -> println("Chave: $k - Valor $v") }

    val map2 = mapOf(
        "Marcia" to 2600.0,
        "Maria" to 3000.0
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor $v") }
}
