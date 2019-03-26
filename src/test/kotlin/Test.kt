import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Test1 {
    @Test fun HelloTest() {
        assertEquals(getText(), "Hello Kotlin")
    }

    @Test fun ArrayTest() {
        val list1 = setOf(1, 2, 3)
        val list2 = setOf(1, 3, 2)
        assertEquals(list1, list2)
    }

    @Test fun saikitest() {
        assertEquals(24, saiki(4))
    }
}