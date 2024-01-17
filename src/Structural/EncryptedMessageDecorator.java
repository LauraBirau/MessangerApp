package src.Structural;

public class EncryptedMessageDecorator extends MessageDecorator {
    public EncryptedMessageDecorator(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        System.out.println("Encrypting message...");
        super.send("This message is private!");
    }
}
