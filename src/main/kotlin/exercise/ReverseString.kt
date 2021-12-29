package exercise

fun reverseUsingSB(str : String) : String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str : String) : String {
//   var reverse = ""
//
//    for(i in str.length -1 downTo 0) {
//        reverse+=str[i]
//    }
//    return reverse
    var sbPhrase = StringBuilder()
    var i = str.length - 1

    while(i >= 0) {
        sbPhrase.append(str[i])
        i--
    }
    return sbPhrase.toString()
}