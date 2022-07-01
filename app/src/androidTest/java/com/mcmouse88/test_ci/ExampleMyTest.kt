package com.mcmouse88.test_ci

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleMyTest {

    @Test
    fun test() {
        val a = 2
        val b = 2
        val expected = test(a, b)
        Assert.assertEquals(5, expected)
    }

    @Test
    fun test2() {
        val a = 4
        val b = 2
        val expected = test2(a, b)
        Assert.assertEquals(2, expected)
    }
}