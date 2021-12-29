package orientacaoObjetosHeranca

class Constants private constructor() {

    companion object BANCO {
        val TABLE = "Pessoa"

        fun teste() {
            println("sou um método estático")
        }
    }

    object VENDAS {
        val TABLE_NOME = "Vendas"

        object COLUNAS {
            val ID = "Id"
            val TOTAL = "Total"
        }
    }
}

/** método é estático (static) ele não precisa ser instanciado para ser utilizado.
 * Para esse recurso se usado significa mais teórico que essa variável e esse método não pertencem mais
 * a uma instância da classe e sim à classe.
 * Variáveis e métodos estáti
 * */

fun main() {
    Math.sin(180.00)

    Constants.TABLE
    Constants.teste()
    Constants.BANCO.TABLE
    Constants.BANCO.teste()
    Constants.VENDAS.COLUNAS.ID
}