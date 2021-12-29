fun main() {

    println(operacao(2,4,"Soma"))
    println(operacao(2,8,"Subtracao"))

}

fun operacao (a : Int, b : Int, c : String) : Int{

    when(c) {
        "Soma" -> {
            return a + b
        }
        "Subtracao" -> {
            return a - b
        }
        "Divisao" -> {
            return a / b
        }
        "Multiplicacao" -> {
            return a * b
        }
        else -> {
            println("Operação incorreta")
            return 0
        }
    }

    when {
        a > 0 && b > 0 -> {
            println("Variaveis maior que zero")
        }
    }

    when {
        a in 1..99 -> {
            println("Século")
        }
    }
}