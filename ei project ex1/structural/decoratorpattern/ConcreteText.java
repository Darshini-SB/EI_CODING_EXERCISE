public class ConcreteText implements Text {
    private String content;

    public ConcreteText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

