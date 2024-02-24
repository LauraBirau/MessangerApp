package src.Creational;

import src.Structural.EmailSender;
import src.Structural.MessageSender;

public interface MessageSenderFactory {
    MessageSender createMessageSender();
}
