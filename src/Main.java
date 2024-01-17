package src;

import src.Creational.MessageService;
import src.Structural.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Singleton Pattern
        MessageService messageService = MessageService.getInstance();

        // Decorator Pattern
        MessageSender emailSender = new EmailSender();
        MessageSender encryptedEmailSender = new EncryptedMessageDecorator(emailSender);

        // Adapter Pattern
        MessageAdapter emailAdapter = new MessageAdapterImpl(emailSender);

    }
    }
