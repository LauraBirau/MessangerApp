package src.Structural;

public class MessageAdapterImpl implements MessageAdapter {
    private MessageSender messageSender;

    public MessageAdapterImpl(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void sendMessage(String message) {
        // Enhance the adapter to handle different types of messages
        System.out.println("Adapter is processing the message...");
        messageSender.send(message);
    }
}
