import jogadoresETreinamentos.jogadorDeFutebol
import jogadoresETreinamentos.sessaoDeTreinamento

fun main() {
    val jogador1 = jogadorDeFutebol("Eduardo", 100, 90, 11, 50)
    val jogador2 = jogadorDeFutebol("Ricardo", 100, 80, 7, 40)

    val sessaojogador1 = sessaoDeTreinamento(10)
    val sessaojogador2 = sessaoDeTreinamento(10)

    sessaojogador1.treinar(jogador1)
    sessaojogador2.treinar(jogador2)

    }
