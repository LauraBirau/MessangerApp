
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

        // Decorator Pattern
        MessageSender emailSender = new EmailSender();
        MessageSender encryptedEmailSender = new EncryptedMessageDecorator(emailSender);

        // Adapter Pattern
        MessageAdapter emailAdapter = new MessageAdapterImpl(emailSender);

        // Factory Pattern
        MessageSenderFactory messageSenderFactory = new MessageSenderFactory();

        // Strategy Pattern
        MessageSendingContext messageSendingContext = new MessageSendingContext();

        // Observer Pattern
        MessageObserver loggingObserver = new LoggingMessageObserver();

        // Console Input for Message Type
        System.out.print("What type do you prefer? (email/sms): ");
        String messageType = scanner.nextLine();
    }
    }
