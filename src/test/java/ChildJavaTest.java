package com.example.demo;

import my.AppPropertyComponent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

public class ChildJavaTest extends com.example.demo.ParentJavaTest {


    @Nested
    class NestedTests {

        @DynamicPropertySource
        public static void childDynamicProperties(DynamicPropertyRegistry registry) {
            registry.add("app.property", () -> "Child");
        }

        @Test
        public void testAppProperty(@Autowired AppPropertyComponent appPropertyComponent) {
            Assertions.assertEquals("Child", appPropertyComponent.getAppProperty());
        }
    }
}