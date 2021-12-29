package orientacaoObjetosHeranca

interface Maquina1 {

        fun ligar()
        fun desligar() {
            println("off")
        }
}

class computador () : Maquina1 {

    override fun ligar() {
        TODO("Not yet implemented")
    }

}

interface interface1 {
    fun ola() {
        println("Interface 1")
    }
}
interface interface2 {
    fun ola() {
        println("Interface 1")
    }
}

class ImplementaInterface : interface1, interface2 {
    override fun ola() {
        super<interface1>.ola()
    }

}

fun main() {

}