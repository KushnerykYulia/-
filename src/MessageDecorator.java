public class MessageDecorator implements Message {
    protected Message decoratedMessage;

    public MessageDecorator(Message decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }

    @Override
    public void sent() {
        decoratedMessage.sent();
    }

    @Override
    public String getDescription() {
        return decoratedMessage.getDescription();
    }
}
