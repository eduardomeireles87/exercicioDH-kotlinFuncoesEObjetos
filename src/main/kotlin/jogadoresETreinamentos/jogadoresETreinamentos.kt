package jogadoresETreinamentos

fun main(){
    var jogador1 = jogadorDeFutebol("Eduardo", 100, 90, 11, 50)
    var jogador2 = jogadorDeFutebol("Ricardo", 100, 80, 7, 40)

    var sessaojogador1 = sessaoDeTreinamento(10)
    var sessaojogador2 = sessaoDeTreinamento(10)

    sessaojogador1.treinar(jogador1)
    sessaojogador2.treinar(jogador2)
}