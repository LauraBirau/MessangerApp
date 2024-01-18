package src.behavioral;


import src.behavioral.MessageObserver;

public class LoggingMessageObserver implements MessageObserver {
    @Override    public void update(String message) {
        System.out.println("Logging: " + message);
    }
}