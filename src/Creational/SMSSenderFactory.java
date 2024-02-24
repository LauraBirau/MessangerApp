package src.Creational;

import src.Structural.MessageSender;
import src.Structural.SMSSender;

public class SMSSenderFactory implements MessageSenderFactory {
    @Override
    public MessageSender createMessageSender() {
        return new SMSSender();
    }
}
