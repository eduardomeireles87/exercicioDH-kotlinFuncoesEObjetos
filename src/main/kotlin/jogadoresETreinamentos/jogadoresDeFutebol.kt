package jogadoresETreinamentos

class jogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int)
{

    fun fazerGol(){
        this.energia -= 5
        this.alegria += 10
        this.gols ++
        println("GOOOOL do $nome!!")
    }

    fun correr(){
        this.energia -= 10
        println("Cansei, disse o jogador: $nome")
    }

    fun status (){
        println("""
            Jogador: $nome
            Energia: $energia
            Alegria: $alegria
            Gols: $gols
            Experiência: $experiencia
        """.trimIndent())

    }
}