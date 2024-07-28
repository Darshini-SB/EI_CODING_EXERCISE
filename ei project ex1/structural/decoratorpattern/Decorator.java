
public abstract class Decorator implements Text {
    protected Text text;

    public Decorator(Text text) {
        this.text = text;
    }
}
