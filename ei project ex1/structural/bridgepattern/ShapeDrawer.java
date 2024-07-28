import javax.swing.*;
import java.awt.*;

public class ShapeDrawer extends JPanel {
    private static ShapeDrawer instance;

    private ShapeDrawer() {
        // Private constructor for singleton
    }

    public static ShapeDrawer getInstance() {
        if (instance == null) {
            instance = new ShapeDrawer();
        }
        return instance;
    }

    public void drawCircle(int x, int y, int radius, String platform) {
        Graphics g = getGraphics();
        g.setColor(Color.RED);  // Color could be changed based on platform
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    public void drawSquare(int x, int y, int side, String platform) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);  // Color could be changed based on platform
        g.drawRect(x - side / 2, y - side / 2, side, side);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Custom painting code
    }
}
