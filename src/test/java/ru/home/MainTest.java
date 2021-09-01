package ru.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Sergei Viacheslaev
 */

class MainTest {

    @BeforeEach
    void setUp() {
        System.out.println("--------STARTING TESTS !!!-----");
    }

    @Test
    void getHelloMessage() {
        String expectedMessage = "Hello from Java 11.0.11";
        Assertions.assertEquals(expectedMessage, Main.getHelloMessage());
    }
}
