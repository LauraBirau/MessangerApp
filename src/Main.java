package src;

import src.Creational.*;
import src.Structural.*;
import src.Behavioural.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        MessageService messageService = MessageService.getInstance();

        // Factory Pattern
        MessageSenderFactory messageSenderFactory;

        // Decorator Pattern
        MessageSender emailSender = new EmailSender("example@example.com");
        MessageSender encryptedEmailSender = new EncryptedMessageDecorator(emailSender);

        // Adapter Pattern

        MessageObserver loggingObserver = new LoggingMessageObserver();

        // Strategy Pattern
        MessageSendingContext messageSendingContext = new MessageSendingContext();
        MessageSendingStrategy defaultStrategy = new EmailSendingStrategy();
        messageSendingContext.setMessageSender(defaultStrategy);

        // Using the patterns
        Scanner scanner = new Scanner(System.in);

        // Console Input for Message Type
        System.out.print("What type do you prefer? (email/sms): ");
        String messageType = scanner.nextLine();

        // Factory Pattern with Console Input
        if ("email".equalsIgnoreCase(messageType)) {
            System.out.print("Enter your email address: ");
            String emailAddress = scanner.nextLine();
            messageSenderFactory = new EmailSenderFactory(emailAddress);
        } else if ("sms".equalsIgnoreCase(messageType)) {
            messageSenderFactory = new SMSSenderFactory();
        } else {
            throw new IllegalArgumentException("Invalid message type: " + messageType);
        }
        MessageSender selectedMessageSender = messageSenderFactory.createMessageSender();

        // Decorator Pattern with Console Input
        System.out.print("Any encryption needed? (yes/no): ");
        String encryptOption = scanner.nextLine();
        if ("yes".equalsIgnoreCase(encryptOption)) {
            selectedMessageSender = new EncryptedMessageDecorator(selectedMessageSender);
        }

        // Adapter Pattern with Console Input
        System.out.print("Do you want to use an adapter? (yes/no): ");
        String useAdapterOption = scanner.nextLine();
        if ("yes".equalsIgnoreCase(useAdapterOption)) {
            // Using the Adapter
            MessageAdapter adapter = new MessageAdapterImpl(selectedMessageSender);
            System.out.print("Enter the message content: ");
            String messageContent = scanner.nextLine();
            adapter.sendMessage("A very thoughtful message: " + messageContent);
        } else {
            // Strategy Pattern with Console Input
            System.out.print("Enter the message content: ");
            String messageContent = scanner.nextLine();
            messageSendingContext.sendMessage(messageContent);
        }

        // Observer pattern usage
        messageService.sendMessage("Message sent from iPhone");
        messageService.addObserver(loggingObserver);
        messageService.sendMessage("Message sent from iPhone with Logging Observer");
    }
}
