package src;

import src.Creational.Singleton;
import src.Structural.Component;
import src.Structural.ConcreteComponent;
import src.Structural.ConcreteDecorator;

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
    }
    }
