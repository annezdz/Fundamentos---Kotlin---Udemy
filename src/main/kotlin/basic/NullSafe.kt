fun main() {

    /***
     * // as vezes antes de assumir um valor o programa precisa ser executado e o nulo é a melhor opção
     */

    val str : String? = null

//    if(str != null) {
//        println(str)
//    }

    print(str?.length) // Null Safe - o Kotlin ajuda a tratar isso, não quebrando o programa

    println(str!!.length) // quando tentamos acessar uma variavel nula e queremos forçar o Kotlin a isso

}