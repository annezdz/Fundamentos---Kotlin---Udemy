package orientacaoObjetos

class Maquina (var marca : String) {
    var nucleos : Int = 0
    get() {
        println("Get foi chamado")
        return field
    }

    set(value) {
        println("Set foi chamado")
        field = value
    }

    fun ligar() {

    }

    fun processar() {

    }

    fun desligar () {

    }
}

fun main() {
    var m = Maquina("Bosch")
    m.nucleos = 10
    println(m.nucleos)

    with(m) {
        ligar()
        processar()
        desligar()
    }
    m.ligar()
    m.desligar()
    m.processar()

}