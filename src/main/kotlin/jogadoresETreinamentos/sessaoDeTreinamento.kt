package jogadoresETreinamentos

class sessaoDeTreinamento(var experiencia: Int = 0) {

    fun treinar (jogador: jogadorDeFutebol){
        experiencia = jogador.experiencia
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += 1
        println("""
            Experiencia anterior: $experiencia
            Experiencia atual: ${jogador.experiencia}
           
        """.trimIndent())
        status(jogador)
        println("\n")
    }

    fun status(jogador: jogadorDeFutebol){
        println("""
            Jogador: ${jogador.nome}
            Energia: ${jogador.energia}
            Alegria: ${jogador.alegria}
            Gols: ${jogador.gols}
            Experiencia: $experiencia
        """.trimIndent())
    }
}