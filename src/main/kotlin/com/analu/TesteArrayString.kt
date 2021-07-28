package com.analu

fun main(){
    val nomes = Array( 3){""}
    nomes[0] = "Ana"
    nomes[1] = "Luiza"
    nomes[2] = "João"

    for (nome in nomes){
        println(nome)
    }

    println("_________________")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("_________________")
    val nomes2 = arrayOf("Maria", "Luiza", "João")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}
