package orientacaoObjetosHeranca

// Mamifero - Animal
// classe abstrata não pode ser instanciada, ela pode definir comportamentos que as outras classes vão herdar.
// Eu sei que Mamifero fala, mas não sei como ele fala e quem define isso são as classes que herdam mamifero


abstract class Mamifero(var nome : String) {

    var peso : Float = 0f

    abstract fun falar()
    fun dormir () {
        println("Estou dormindo")
    }
}

class Cachorro (nome : String, peso : Float) : Mamifero(nome) {

    init {
        this.peso = peso
    }
    override fun falar() {
        println("au au")
    }
}

class Gato (nome : String) : Mamifero(nome) {
    override fun falar() {
        println("miau")
    }

}

fun main() {

    //Mamifero("Leão")

}