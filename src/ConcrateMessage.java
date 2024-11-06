public class ConcrateMessage implements Message {
    private String text;

    public ConcrateMessage(String text) {
        this.text = text;
    }

    @Override
    public void sent() {
        System.out.println("Надіслано повідомлення " +  text);
    }

    @Override
    public String getDescription() {
        return "Повідомлення: " + text ;
    }
}
