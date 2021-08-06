package jogadoresETreinamentos

class sessaoDeTreinamento (var experiencia: Int =1) {

    fun treinar(jogador: jogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiência inicial: ${jogador.experiencia}")
        jogador.experiencia += experiencia
        println("Experiência final: ${jogador.experiencia}")
    }
}