package src.Behavioural;

public class MessageSendingContext {
    private MessageSendingStrategy messageSendingStrategy;

    public void setMessageSender(MessageSendingStrategy messageSendingStrategy) {
        this.messageSendingStrategy = messageSendingStrategy;
    }

    public void sendMessage(String message) {
        if (messageSendingStrategy != null) {
            messageSendingStrategy.sendMessage(message);
        } else {
            System.out.println("No message sending strategy set!");
        }
    }
}
