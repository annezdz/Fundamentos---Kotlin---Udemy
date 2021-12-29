package exercise


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseStringTEst {

    @Test
    fun reverseUsingSB() {
        assertEquals("bs niltok", reverseUsingSB("kotlin sb"))
    }

    @Test
    fun reverseUsingLoop() {
        assertEquals("bs niltok", reverseUsingLoop("kotlin sb"))
    }
}