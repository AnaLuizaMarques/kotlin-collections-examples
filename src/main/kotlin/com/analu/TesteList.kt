package com.analu

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "pj")
    val marcia = Funcionario(nome = "Marcia", salario = 1000.0, tipoContratacao = "clt")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "pj")

    val funcionarios = listOf(joao, marcia, maria)

    funcionarios.forEach { println(it) }

    println("1_________________________________")
    println(funcionarios.find { it.nome == "Maria" })

    println("2_________________________________")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("3_________________________________")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}
