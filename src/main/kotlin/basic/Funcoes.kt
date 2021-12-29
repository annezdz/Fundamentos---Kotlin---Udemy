fun calculaBonus(a : Int, b: Int, c: Int) {
    println("O bonus é : ${a + b + c}")
}

fun hello(nome : String) : String {
   return "Olá $nome"
}

fun hello2(nome : String) = "Olá $nome"
fun soma(a : Int, b: Int) : Int = a + b

fun main() {

    val a = 10
    val b = 20
    val c = 30

    println(soma(1,1))

    calculaBonus(10,20,30)
    println(hello("Anne"))

}