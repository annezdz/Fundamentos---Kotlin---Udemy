fun calculaBonus1(cargo : String, salario: Float) : Float{
    return if(cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2f
    }
}


//Operador Ternário - NÃO EXISTE TERNARIO EM KOTLIN, tem que usar o if else conforme abaixo
// String str = valor == 10 ? "Sim" : "Não";

val valor = 10
val str = if(valor == 10) "Sim" else "Não"




fun maiorIdade(idade : Int) : Boolean {
    return idade >= 18
}

fun main() {

    println(maiorIdade(10))
    println(maiorIdade(18))
    println(maiorIdade(27))
    println(calculaBonus1("Coordenador", 1000f))
    println(calculaBonus1("Gerente Junior", 1000f))
    println(calculaBonus1("nenhum", 1000f))

    //Operador Elvis ?: trabalha com variáveis que podem ser nulas

    val test : Int ? = null // esta variável pode ser nula, é isso que o Kotlin faz e tem que colocar o
    // tipo e o ?
    val op : Int = test ?: 100 // se o valor de test for nulo, retorne 100
    println(op)

}