package src.Structural;

public abstract class MessageDecorator implements MessageSender {
    private MessageSender messageSender;

    public MessageDecorator(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void send(String message) {
        messageSender.send(message);
    }
}