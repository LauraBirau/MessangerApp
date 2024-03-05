
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
        MessageSender emailSender = new EmailSender();
        MessageSender encryptedEmailSender = new EncryptedMessageDecorator(emailSender);

        // Adapter Pattern

        MessageObserver loggingObserver = new LoggingMessageObserver();

        // Strategy Pattern
        MessageSendingContext messageSendingContext = new MessageSendingContext();

        // Using the patterns
        Scanner scanner = new Scanner(System.in);

        // Console Input for Message Type
        System.out.print("What type do you prefer? (email/sms): ");
        String messageType = scanner.nextLine();

        // Factory Pattern with Console Input
        if ("email".equalsIgnoreCase(messageType)) {
            messageSenderFactory = new EmailSenderFactory();
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
            MessageAdapter adapter = new MessageAdapterImpl(selectedMessageSender);
            adapter.sendMessage("A very thoughtful message!");
        } else {
            // Strategy Pattern with Console Input
            messageSendingContext.setMessageSender(selectedMessageSender);
            System.out.print("Enter the message content: ");
            String messageContent = scanner.nextLine();
            messageSendingContext.sendMessage(messageContent);
        }

        // Observer pattern usage
        messageService.sendMessage("Message sent from Iphone");
        messageService.addObserver(loggingObserver);
        messageService.sendMessage("Message sent from Iphone with Logging Observer");
    }
}