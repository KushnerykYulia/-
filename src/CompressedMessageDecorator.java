public class CompressedMessageDecorator extends MessageDecorator {
    private String compression;
    public CompressedMessageDecorator(Message decoratedMessage, String compression){
        super(decoratedMessage);
        this.compression = compression;
    }

    public void sent() {
        super.sent();
        System.out.println("Застосовано стиснення способом " + compression);
    }

    @Override
    public String getDescription() {
        return decoratedMessage.getDescription() + ". Застосоване стиснення: " + compression;
    }
}
