package basic


fun media1 (vararg notas : Float) {
    if(notas.isNotEmpty()) {
        var sum = 0f
        for (nota in notas) {
            sum += nota;
        }

        println("A media é : ${sum / notas.size}")
    }
}

fun <T> media (vararg valores: T) {
    for (valor in valores) {
        println(valor)
    }
}
fun main() {

    media1(1f, 2f, 10f, 8.0f)
    media("Anne", "28/07/1985",36,9.9f,'c')
}