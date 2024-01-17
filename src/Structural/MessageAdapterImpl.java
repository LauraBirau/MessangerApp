package src.Structural;

public class MessageAdapterImpl implements MessageAdapter {
    private MessageSender messageSender;

    public MessageAdapterImpl(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    @Override    public void sendMessage(String message) {
        messageSender.send(message);
    }
}
