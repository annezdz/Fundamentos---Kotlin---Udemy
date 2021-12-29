import java.lang.Exception

fun main() {

//    // Conversoes do maior para o menor
//
//    val n1 : Double = Double.MAX_VALUE
//    val b1 : Byte = 100
//
//
//    //Em Kotlin a conversão precisa ser explicita e o problema não acontece do menor para o maior
//    // mas do maior para o menor
//
//    println(b1.toLong())
//    println(b1.toFloat())
//    println(b1.toDouble())
//    println(b1.toShort())
//
//    println("10".toInt())
//    println("10".toDouble())

    // Quando for tratar uma excessão, sempre a mais especifica primeiro e depois
    // as mais genéricas

    try {
        println("uuuu".toInt())

    } catch (e : NumberFormatException) {
        println("Not a number")

    } catch (e: Exception) {
        println("Algo de errado aconteceu")
    } finally {
        println("teste finally")
    }
}

//fun teste(n1 : Int) {
//
//}