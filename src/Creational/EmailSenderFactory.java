package src.Creational;

import src.Structural.EmailSender;
import src.Structural.MessageSender;

public class EmailSenderFactory implements MessageSenderFactory {
    @Override
    public MessageSender createMessageSender() {
        return new EmailSender();
    }
}