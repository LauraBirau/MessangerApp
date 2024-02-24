package src.Structural;

public class EmailSender implements MessageSender {
    private String emailAddress;

    public EmailSender(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email from " + emailAddress + ": " + message);
    }
}
