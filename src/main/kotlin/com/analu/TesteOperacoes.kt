package com.analu

fun main(){
    val salarios = doubleArrayOf(1000.0, 2550.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("_________________")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("________________________")
    salariosMaiorQue2500.forEach { println(it)}

    println("________________________")
    println(salarios.count { it in 2000.0..5000.0})

    println("________________________")
    println(salarios.find { it == 2550.0})
    println(salarios.find { it == 500.0})

    println("________________________")
    println(salarios.any { it == 1000.0  })
    println(salarios.any { it == 500.0  })
}