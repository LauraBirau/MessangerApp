
package src;

import src.Creational.MessageSenderFactory;
import src.Creational.MessageSendingContext;
import src.Creational.MessageService;
import src.Structural.*;
import src.behavioral.LoggingMessageObserver;
import src.behavioral.MessageObserver;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Singleton Pattern
        MessageService messageService = MessageService.getInstance();

        // Factory Pattern
        MessageSenderFactory messageSenderFactory = new MessageSenderFactory();

        // Decorator Pattern
        MessageSender emailSender = new EmailSender();
        MessageSender encryptedEmailSender = new EncryptedMessageDecorator(emailSender);

        // Adapter Pattern
        MessageAdapter emailAdapter = new MessageAdapterImpl(emailSender);

        MessageObserver loggingObserver = new LoggingMessageObserver();

        // Strategy Pattern
        MessageSendingContext messageSendingContext = new MessageSendingContext();

        // Using the patterns

        // Console Input for Message Type
        System.out.print("What type do you prefer? (email/sms): ");
        String messageType = scanner.nextLine();

        // Factory Pattern with Console Input
        MessageSender selectedMessageSender = messageSenderFactory.createMessageSender(messageType);

        // Decorator Pattern with Console Input
        System.out.print("Any encryption needed? (yes/no): ");
        String encryptOption = scanner.nextLine();
        if ("yes".equalsIgnoreCase(encryptOption)) {
            selectedMessageSender = new EncryptedMessageDecorator(selectedMessageSender);
        }
        // Adapter Pattern with Console Input        System.out.print("Do you want to use an adapter? (yes/no): ");
        String useAdapterOption = scanner.nextLine();
        if ("yes".equalsIgnoreCase(useAdapterOption)) {
            MessageAdapter adapter = new MessageAdapterImpl(selectedMessageSender);
            adapter.sendMessage("Message sent successfully");
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
