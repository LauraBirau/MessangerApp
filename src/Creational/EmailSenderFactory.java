package src.Creational;

import src.Structural.EmailSender;

public class EmailSenderFactory implements MessageSenderFactory {
    private String emailAddress;

    // Constructor to accept the email address
    public EmailSenderFactory(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public EmailSender createMessageSender() {
        // Creating an instance of EmailSender with the provided email address
        return new EmailSender(emailAddress);
    }
}
