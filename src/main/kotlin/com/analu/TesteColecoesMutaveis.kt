package com.analu
// colecoes que podem ser mutaveis
fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "pj")
    val marcia = Funcionario(nome = "Marcia", salario = 1000.0, tipoContratacao = "clt")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "pj")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("________________")
    funcionarios.add(marcia)
    funcionarios.forEach { println(it) }

    println("________________")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("_______SET_________")
    val funcionarioSet = mutableSetOf(joao)
    // funcionarios.forEach { println(it) }

    println("________________")
    funcionarioSet.add(marcia)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("________________")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}