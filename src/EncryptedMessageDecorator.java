public class EncryptedMessageDecorator extends MessageDecorator{
    private String code;
    public EncryptedMessageDecorator(Message decoratedMessage, String code){
        super(decoratedMessage);
        this.code = code;
    }

    public void sent() {
        System.out.println("Змінено шифрування на " + code);
    }

    @Override
    public String getDescription() {
        return decoratedMessage.getDescription() + ". З шифруванням " + code;
    }
}
