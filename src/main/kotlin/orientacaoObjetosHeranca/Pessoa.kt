package orientacaoObjetosHeranca

class Pessoa {

    lateinit var nome : String

    fun geradorDeNome() {
        nome = "teste nome"
    }
}

fun main() {

    val p = Pessoa()
    p.geradorDeNome()
}