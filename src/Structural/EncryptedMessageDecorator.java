package src.Structural;

public class EncryptedMessageDecorator extends MessageDecorator {

    // Default encryption algorithm or no algorithm if not provided
    private static final String DEFAULT_ENCRYPTION_ALGORITHM = "DefaultEncryptionAlgorithm";

    public EncryptedMessageDecorator(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        System.out.println("Encrypting message using " + DEFAULT_ENCRYPTION_ALGORITHM + "...");
        super.send("This message is private!");
    }
}
