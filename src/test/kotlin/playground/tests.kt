package playground

import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test fun hello() {
        assertEquals("Hello, kotlin!", getHello())
    }
}
