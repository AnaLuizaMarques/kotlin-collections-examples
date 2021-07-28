package com.analu

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "pj")
    val marcia = Funcionario(nome = "Marcia", salario = 1000.0, tipoContratacao = "clt")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "pj")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(marcia.nome, marcia)

    println(repositorio.findById(maria.nome))

    println("_____________")
    repositorio.findAll().forEach { println(it) }

    println("_____________")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}