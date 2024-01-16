package src;

import src.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);
    }
    }
