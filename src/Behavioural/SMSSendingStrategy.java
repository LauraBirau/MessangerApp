package src.Behavioural;

public class SMSSendingStrategy implements MessageSendingStrategy {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
