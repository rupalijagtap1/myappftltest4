package com.example.myappftltest4

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myappftltest4", appContext.packageName)
    }

    @Test
    fun passingTest1(){
        assert(true)
    }

    @Test
    fun passingTest2(){
        assert(true)
    }

    @Test
    fun passingTest3(){
        assert(true)
    }


}