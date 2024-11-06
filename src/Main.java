public class Main {
    public static void main(String[] args) {
        Message firstMessage = new ConcrateMessage("Hello!");

        firstMessage = new EncryptedMessageDecorator(firstMessage, "ASCII");
        firstMessage = new TimestampMessageDecorator(firstMessage, "06.11.2024", "11:47");
        firstMessage = new AuthorMessageDecorator(firstMessage, "Kushneryk Yulia");

        firstMessage.sent();
        System.out.println(firstMessage.getDescription());

    }
}