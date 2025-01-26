import ghidra.examples.Sample
import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest {
    private val testSample: Sample = Sample()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }
}
