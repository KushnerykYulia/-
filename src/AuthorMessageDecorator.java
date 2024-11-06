class AuthorMessageDecorator extends MessageDecorator {
    private String author;
    public AuthorMessageDecorator(Message decoratedMessage, String author){
        super(decoratedMessage);
        this.author = author;
    }

    public void sent() {
        System.out.println("Додано автора повідомлення: " + author);
    }

    @Override
    public String getDescription() {
        return decoratedMessage.getDescription() + ". Автор: " + author;
    }
}