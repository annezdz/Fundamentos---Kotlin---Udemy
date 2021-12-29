package collections

fun main() {

    // List - array , Set , HashMap

    val l1 = listOf<String>("Madrid", "São Paulo", "Berlin", "Madrid") // é imutavel , repete
    val l2 = mutableListOf("Madrid", "São Paulo", "Berlin") // mutavel
    val l3 = arrayListOf("Madrid", "São Paulo", "Berlin")

    val l4 = setOf("Madrid", "São Paulo", "Berlin", "Madrid") // não repete
    val l5 = mutableSetOf("Madrid", "São Paulo", "Berlin", "Madrid") // não repete, mutavel

    val h1 = hashMapOf<String, String>(Pair("key","value"), Pair("Franca","Paris"))
    println(h1["Franca"])

    val m1 = mapOf(Pair("key","value"), Pair("Franca","Paris"))
    val m2 = mutableMapOf(Pair("key","value"), Pair("Franca","Paris"))


    println(l1)
    println(l2)
    println(l3)
    println(l4)
    println(l5)




}