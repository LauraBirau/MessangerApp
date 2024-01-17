package src;

import src.Creational.Singleton;
import src.Structural.*;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

        // Decorator Pattern
        Component basicComponent = new ConcreteComponent();
        basicComponent.operation();

        Component decoratedComponent = new ConcreteDecorator(basicComponent);
        decoratedComponent.operation();

        // Adapter Pattern
        Target target = new Adapter();
        target.request();
    }
    }
