package com.example.demo

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class GreetingControllerTest {
    @Test
    fun `greeting returns expected value`() {
        // Given
        val uut = GreetingController()
        val expected = Greeting(1, "Hello, World")

        // When
        val result = uut.greeting("World")

        // Then
        assertThat(result).isEqualTo(expected)
    }
}
