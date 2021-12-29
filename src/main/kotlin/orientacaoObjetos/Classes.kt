package orientacaoObjetos


class Pessoal

class Pessoa2(var nome : String, var anoNascimento : Int)

class Pessoa3(var nome : String) {

    var ano : Int ? = null

    constructor(nome : String, ano : Int) : this(nome)
    {
        this.ano = ano
    }
    fun saudacao() {
        println("Ola, meu nome é ${nome} e nasci em ${ano}")
    }
}

fun main() {

    val p1 : Pessoa3 = Pessoa3("Dudu",2017)
    val p2 : Pessoa3 = Pessoa3("Dudu")
    p1.saudacao()
    p2.saudacao()

    val pessoa : Pessoa = Pessoa()
    pessoa.nome = "Anne"


}