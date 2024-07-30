package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
   // Amrit Paudel 
    private final String message = "This is Jenkins demo";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
