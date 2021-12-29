fun main() {

    val frase = "Kotlin é uma linguagem"
    val caracteristica = "show!"
    val idade = 10

    println(frase + caracteristica + idade)

    println("Kotlin é $caracteristica")

    println("Kotlin é ${caracteristica.length}")

    val str = """ddadd
        |adadad
        |afsfsfsf
        |xgdg
    """.trimMargin()

    println(str)
}