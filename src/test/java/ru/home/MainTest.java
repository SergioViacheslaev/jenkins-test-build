package ru.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Sergei Viacheslaev
 */
class MainTest {

    @Test
    void getHelloMessage() {
        String expectedMessage = "Hello from Java 11.0.11";
        Assertions.assertEquals(expectedMessage, Main.getHelloMessage());
    }
}
