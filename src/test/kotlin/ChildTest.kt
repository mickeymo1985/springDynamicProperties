package com.example.demo

import my.AppPropertyComponent
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource

class ChildTest : ParentTest() {

    companion object {
        @DynamicPropertySource
        @JvmStatic
        fun dynamicProperties(registry: DynamicPropertyRegistry) {
            registry.add("app.property") { "Child" }
        }
    }

    @Autowired
    lateinit var appPropertyComponent: AppPropertyComponent

    @Test
    fun testAppProperty() {
        println("!!!!!!!! ${ appPropertyComponent.appProperty}")
        assertEquals("Child", appPropertyComponent.appProperty)
    }

}
