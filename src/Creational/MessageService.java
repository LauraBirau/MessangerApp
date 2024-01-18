package src.Creational;

import src.Behavioural.MessageObserver;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
    private static MessageService instance;

    private List<MessageObserver> observers = new ArrayList<>();

    private MessageService() {}

    public static MessageService getInstance() {
        if (instance == null) {
            instance = new MessageService();
        }
        return instance;
    }
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        notifyObservers(message);

    }

    public void addObserver(MessageObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (MessageObserver observer : observers) {
            observer.update(message);
        }
    }
}
