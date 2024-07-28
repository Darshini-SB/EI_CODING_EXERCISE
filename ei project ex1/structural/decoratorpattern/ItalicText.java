public class ItalicText extends Decorator {
    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<i>" + text.getContent() + "</i>";
    }
}
