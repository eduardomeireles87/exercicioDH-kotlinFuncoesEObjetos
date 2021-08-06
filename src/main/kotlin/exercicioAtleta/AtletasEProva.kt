package exercicioAtleta

fun main(){
    var atleta1 = atleta ("Eduardo", 19 , 95)
    var atleta2 = atleta ("Ricardo", 35 , 112)

    var prova1 = prova (10 , 80)

    println(prova1.podeRealizar(atleta1))
    println(prova1.podeRealizar(atleta2))
}