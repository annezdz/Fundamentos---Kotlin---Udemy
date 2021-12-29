package orientacaoObjetos

enum class Prioridade {
    BAIXA, MEDIA, ALTA
}
enum class Prioridade1 (val id : Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super baixa -"
        }
    }, MEDIA(5), ALTA(10)
}

class Alarme(var descricao : String, prioridade : Prioridade1)
fun main() {

    //Alarme("Alerta",Prioridade1.ALTA)
    Prioridade.ALTA
    for(p in Prioridade1.values()) {
        println("Tipo: $p - ID:  ${p.id} -- Ordinal: ${p.ordinal} ")

        if(p.toString() == "ALTA") {
            println("True")
        }
    }


}