package exercise

fun countVowels(phrase : String): Int {
//    var count = 0
//    for(v in 0 .. phrase.length - 1) {
//        val ch = phrase[v].toLowerCase()
//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//            count ++
//        }
//    }
//    return count

    //ou
//    val VOWELS = "aeiou"
//    var totalVowels = 0
//
//    for (letter in phrase) {
//        if(letter.toLowerCase() in VOWELS) totalVowels++
//    }
//    return totalVowels
//
    var count = 0;
    val regex = """([aeiou])?""".toRegex()
    for(element in phrase) {
        val ch = element.toLowerCase()
        if(regex.matches(ch.toString())) {
            count++;
        }
    }
    return count

}

fun countConsonants(phrase : String) : Int {
    var count = 0;
    val regex = """([aeiou?!. ])?""".toRegex()
    for(element in phrase) {
        val ch = element.toLowerCase()
        if(!regex.matches(ch.toString())) {
            count++;
        }
    }
    return count

//    val CONSONANTS = "bcdfghjklmnpqrstvxyzw"
//    var totanConsonants = 0
//
//    for (letter in phrase) {
//        if(letter.toLowerCase() in CONSONANTS) totanConsonants++
//    }
//    return totanConsonants
}

fun countVowelsFilter(phrase: String) = phrase.filter { it.toLowerCase() in "aeiou" }.length
