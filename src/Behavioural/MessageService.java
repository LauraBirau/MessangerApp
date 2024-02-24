package src.Behavioural;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
    private static MessageService instance = new MessageService();
    private List<MessageObserver> observers = new ArrayList<>();

    private MessageService() {}

    public static MessageService getInstance() {
        return instance;
    }

    public void addObserver(MessageObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MessageObserver observer) {
        observers.remove(observer);
    }

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (MessageObserver observer : observers) {
            observer.update(message);
        }
    }
}
