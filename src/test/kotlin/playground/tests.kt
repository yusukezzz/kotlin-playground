package playground

import kotlin.test.assertEquals
import org.junit.Test as test

class TestSource {
    @test fun hello() {
        assertEquals("Hello, kotlin!", getHello())
    }
}
