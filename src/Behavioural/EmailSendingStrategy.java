package src.Behavioural;

public class EmailSendingStrategy implements MessageSendingStrategy {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
