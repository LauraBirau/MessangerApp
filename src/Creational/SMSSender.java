package src.Creational;

import src.Structural.MessageSender;

public class SMSSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}