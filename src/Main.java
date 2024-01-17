package src;

import src.Structural.*;
import src.Creational.Singleton;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Singleton Pattern
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

        // Decorator Pattern
        MessageSender emailSender = new EmailSender();
        MessageSender encryptedEmailSender = new EncryptedMessageDecorator(emailSender);

        // Adapter Pattern
        MessageAdapter emailAdapter = new MessageAdapterImpl(emailSender);
        
    }
    }
