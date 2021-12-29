fun main() {
    // for - loop - itera em uma lista

    val str = "Anne Zimmermann"
    for (c in str) {
       // print("$c")
    }

    for (i in 1..100){
        print("$i ")
    }

    for (i in 1..100 step 2){ // de 2 em 2
        println("$i ")
    }

    for (j in 100 downTo 0) {
        print("$j ")
    }
}