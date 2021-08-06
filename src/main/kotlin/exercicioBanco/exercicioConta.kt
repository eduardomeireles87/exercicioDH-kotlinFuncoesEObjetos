package classes.exercicioContaBancaria

import classes.exercicioContaBancaria.exercicioBanco.cliente

fun main (){
            val pessoa1 = cliente ("Eduardo" , "Meireles")
            val pessoa2 = cliente ("Ricardo" , "Campos")

            val contapessoa1 = conta (1, 800.07, pessoa1)
            val contapessoa2 = conta(2 , 35748.12 , pessoa2)

            contapessoa1.deposito (800.05)
            contapessoa1.saldo
        }