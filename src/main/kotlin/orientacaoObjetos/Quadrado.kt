package orientacaoObjetos

class Quadrado (val area : Float) {

}

data class Triangulo(val area : Float)


/**
 * Essa classe aqui ela não tem responsabilidade alguma a não ser agregar os atributos.
 * Data class representa uma classe que transita dados */

data class Pessoa5 (var b : Boolean, var s : String, var i : Int) {

    fun tes() {
        println("imprimindo data class")
    }
}

fun main() {

    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    println(q1)
    println(t1)
    println(t1 == t2)
    println(q1 == q2)
    println(t1.hashCode())
    println(t2.hashCode())
    println(q1.hashCode())
    println(q2.hashCode())

    //copy

    val t3 = t2.copy()

}