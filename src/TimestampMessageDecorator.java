public class TimestampMessageDecorator extends MessageDecorator{
    private String timestamp;
    private String date;
    public TimestampMessageDecorator(Message decoratedMessage, String timestamp, String date){
        super(decoratedMessage);
        this.timestamp = timestamp;
        this.date = date;
    }

    public void sent() {
        super.sent();
        System.out.println("Додано час: " + timestamp + ". Додано дату: " + date);
    }

    @Override
    public String getDescription() {
        return decoratedMessage.getDescription() + ". Додано час: " + timestamp + ". Додано дату: " + date;
    }
}
