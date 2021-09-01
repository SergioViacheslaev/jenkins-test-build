package ru.home;

/**
 * @author Sergei Viacheslaev
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getHelloMessage());
    }

    public static String getHelloMessage() {
        return "Hello from Java " + System.getProperty("java.version");
    }
}
