package src;

import src.Structural.*;
import src.Creational.Singleton;
public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

        // Decorator Pattern
        MessageSender emailSender = new EmailSender();
        MessageSender encryptedEmailSender = new EncryptedMessageDecorator(emailSender);

        // Adapter Pattern
        Target target = new Adapter();
        target.request();
    }
    }
