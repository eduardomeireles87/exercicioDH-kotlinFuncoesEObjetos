package exercicioAtleta

class prova (var dificuldade: Int, var energiaNecessaria: Int) {

    fun podeRealizar (atleta: atleta): Boolean{
        if (atleta.nivel >= dificuldade && atleta.energia >= this.energiaNecessaria){
        return true
    }
        return false
}
}