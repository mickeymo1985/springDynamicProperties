package com.example.demo

import my.Main
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource

@SpringBootTest(classes = [Main::class])
//@TestPropertySource(properties = ["app.property=ModifiedValueFromTest"])
open class SuperParentTest {

    companion object {
        @DynamicPropertySource
        @JvmStatic
        fun dynamicProperties(registry: DynamicPropertyRegistry) {
            registry.add("app.property") { "Parent" }
        }
    }

}
