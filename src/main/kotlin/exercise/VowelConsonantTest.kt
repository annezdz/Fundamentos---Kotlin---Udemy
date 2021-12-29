package exercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class VowelConsonantTest {

    @Test
    fun countVowels() {
        assertEquals(11,countVowels("Quantas vogais tem essa frase?"))
    }

    @Test
    fun countConsonants() {
        assertEquals(14,countConsonants("Quantas vogais tem essa frase?"))
    }

    @Test
    fun countVowelsAndConsonants() {
        val phrase = "Estou gostando muito de aprender Kotlin!"
        assertEquals(15,countVowels(phrase))
        assertEquals(19,countConsonants(phrase))
    }

    @Test fun countVowelsFilter() {
        assertEquals(8, countVowelsFilter("Minha fase com vogais!"))
    }
}