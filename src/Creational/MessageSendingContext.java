package src.Creational;

import src.Structural.MessageSender;

public class MessageSendingContext {
    private MessageSender messageSender;

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    public void sendMessage(String message) {
        messageSender.send(message);
    }
}