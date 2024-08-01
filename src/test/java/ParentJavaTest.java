package com.example.demo;

import my.Main;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
@SpringBootTest(classes = Main.class)
public class ParentJavaTest {

    @DynamicPropertySource
    public static void dynamicProperties(DynamicPropertyRegistry registry) {
        registry.add("app.property", () -> "Parent");
    }
}
