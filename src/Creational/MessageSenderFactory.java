package src.Creational;

import src.Structural.EmailSender;
import src.Structural.MessageSender;

public class MessageSenderFactory {
    public MessageSender createMessageSender(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailSender();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SMSSender();
        }
        return null;
    }
}
