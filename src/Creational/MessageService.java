package src.Creational;

public class MessageService {
    private static MessageService instance;

    private MessageService() {}

    public static MessageService getInstance() {
        if (instance == null) {
            instance = new MessageService();
        }
        return instance;
    }
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}
