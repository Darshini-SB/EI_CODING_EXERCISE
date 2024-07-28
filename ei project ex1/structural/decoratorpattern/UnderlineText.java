public class UnderlineText extends Decorator {
    public UnderlineText(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<u>" + text.getContent() + "</u>";
    }
}
