package com.mycompany.app;

/**
 * Hello world!
 */ 
public class App
{
 // code changed 
    private final String message = "This is jenkins demo";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
