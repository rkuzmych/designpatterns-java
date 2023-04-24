package decorator;

public class Base64EncodedMessage implements Message {

    private final Message message;

    public Base64EncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent();
    }
}
