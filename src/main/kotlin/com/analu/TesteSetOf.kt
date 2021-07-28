package com.analu

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "pj")
    val marcia = Funcionario(nome = "Marcia", salario = 1000.0, tipoContratacao = "clt")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "pj")

    val funcionarios1 = setOf(joao, marcia)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao, marcia, maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("________________")
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("________________")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}