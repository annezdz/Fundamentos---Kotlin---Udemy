package orientacaoObjetosHeranca

interface Funcionario {
    fun calculaBonus()
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("Bonus : 500")
    }

}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Bonus : 200")

    }
}

class Analista : Funcionario {
    override fun calculaBonus() {
        println("Bonus : 900")

    }

}

fun main() {

    val funcionario : Funcionario = Gerente()
    val funcionario2 : Funcionario = Tecnico()
    val funcionario3 : Funcionario = Analista()
    calculo(funcionario)
    calculo(funcionario2)
    calculo(funcionario3)
}

fun calculo(funcionario: Funcionario) {
    funcionario.calculaBonus()
}

