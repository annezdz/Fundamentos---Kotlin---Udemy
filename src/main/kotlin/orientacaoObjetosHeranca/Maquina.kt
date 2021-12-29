package orientacaoObjetosHeranca

open class Maquina (val marca :String) {

    open fun minhaMarca() {
        println("Minha marca é $marca.")
    }
}
/**
 * Override - sobrescrever
 * Overloading - sobrecarga - método com mesmo nome porem paramentros ou tipos de parametros diferentes  diferentes
 * */
class Computador(marca : String, val nucleos : Int) : Maquina(marca){

    override fun minhaMarca() {
        "Estou reescrevendo minha marca!!!"
        super.minhaMarca()
    }
    fun ligar (){ println("Método ligar chamado ")}
    fun processar(){println("Método processar chamado ")}

    fun overload(i : Int) = println("Overload 1")
    fun overload(i : String) = println("Overload 1")
    fun overload(i : Int, j : Boolean) = println("Overload 1")

}

fun main() {
    val computer = Computador("Intel", 10)
    with(computer) {
        ligar()
        processar()
        minhaMarca()
        overload(10, true)
    }
}