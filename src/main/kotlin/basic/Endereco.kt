package basic


/**
 * Vamos supor que não queremos passar o numero, ai copiamos o método e excluimos o
 * atributo numero. Isso é duplicação de código e não é bom.
 * Mas o que fazer ?
 * Podemos definir o numero com um valor Default, sendo assim se ninguem passar nada
 * retorna um vazio. No main para pular uma variável que tem o valor default é dessa forma
 * */
//fun endereco2(rua : String, cidade : String, estado : String, cep : String) {
//    println("Rua : $rua")
//    println("Cidade : $cidade, $estado, $cep")
//}

fun endereco(rua : String = "", cidade : String, estado : String, cep : String, numero : String = "") {
    println("Rua : $rua")
    println("Cidade : $cidade, $estado, $cep")
}
fun main() {
        endereco(cidade = "Blumenau", estado = "SC",cep = "89046999")
        endereco(cep = "99999999",estado = "SP",cidade = "Sao Paulo")
}