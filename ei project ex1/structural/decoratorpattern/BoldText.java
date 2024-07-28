public class BoldText extends Decorator {
    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<b>" + text.getContent() + "</b>";
    }
}

