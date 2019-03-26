import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Anagram {
    @Test
    fun Test1() {
        assertEquals(anagram("a"), setOf("a"))
    }

    @Test
    fun Test2() {
        assertEquals(anagram("ab"), setOf("ab", "ba"))
        assertEquals(anagram("ba"), setOf("ab", "ba"))
        assertEquals(anagram("aa"), setOf("aa"))
    }

    @Test
    fun Test3() {
        assertEquals(
            anagram("abc"), setOf(
                "abc", "acb",
                "bac", "bca",
                "cab", "cba"
            )
        )

        assertEquals(
            anagram("aab"), setOf(
                "aab", "aba", "baa"
            )
        )

        assertEquals(
            anagram("aba"), setOf(
                "aab", "aba", "baa"
            )
        )

        assertEquals(
            anagram("aaa"), setOf("aaa")
        )

    }

    @Test
    fun Testw1() {
        assertEquals(anagramw("a"), setOf("a"))
    }

    @Test
    fun Testw2() {
        assertEquals(anagramw("ab"), setOf("ab", "ba"))
        assertEquals(anagramw("ba"), setOf("ab", "ba"))
        assertEquals(anagramw("aa"), setOf("aa"))
    }

    @Test
    fun Testw3() {
        assertEquals(
            anagramw("abc"), setOf(
                "abc", "acb",
                "bac", "bca",
                "cab", "cba"
            )
        )

        assertEquals(
            anagramw("aab"), setOf(
                "aab", "aba", "baa"
            )
        )

        assertEquals(
            anagramw("aba"), setOf(
                "aab", "aba", "baa"
            )
        )

        assertEquals(
            anagramw("aaa"), setOf("aaa")
        )
    }
}