package com.mycompany.app;

public class App implements java.util.function.Consumer<String>
{
    public void accept(String args)
    {
        System.out.println("Accept " + args);
    }
}
