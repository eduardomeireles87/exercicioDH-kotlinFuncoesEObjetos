package jogadoresETreinamentos

class jogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int)
{

    fun fazerGol(){
        this.energia -= 5
        this.alegria += 10
        this.gols += 1
        println("GOOOOL!")
    }

    fun correr(){
        this.energia -= 10
        println("Cansei")
    }
}