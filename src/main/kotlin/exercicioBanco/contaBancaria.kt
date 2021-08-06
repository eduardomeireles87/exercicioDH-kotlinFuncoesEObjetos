package classes.exercicioContaBancaria

import classes.exercicioContaBancaria.exercicioBanco.cliente

class conta (var numeroDaConta: Int, var saldo: Double, var titular: cliente) {

fun deposito (depositoEmDinheiro: Double) {
    this.saldo + depositoEmDinheiro
    println("Transação realizada. Saldo na conta de $saldo")
}

fun saque (saqueEmDinheiro: Double){
    saldo - saqueEmDinheiro
    if (saqueEmDinheiro > saldo){
        print ("Operação cancelada. Saldo insuficiente!")
    }else{
        println ("Transação realizada com sucesso. Saldo atual da conta $saldo")
    }
}
}