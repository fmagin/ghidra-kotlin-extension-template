import ghidra.examples.Sample
import resources.ResourceManager
import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest {
    private val testSample: Sample = Sample()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

    @Test
    fun testResourceManager() {
        val testJson = ResourceManager.getResource("testfile.txt")
        assertEquals(testJson.readText(), "test")
    }
}
