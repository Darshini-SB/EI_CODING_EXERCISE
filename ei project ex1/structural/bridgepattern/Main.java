import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Set up JFrame
        JFrame frame = new JFrame("Shape Drawer");
        ShapeDrawer drawer = ShapeDrawer.getInstance();
        frame.add(drawer);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Input for Circle
        int x = 100;
        int y = 100;
        int radius = 50;
        Shape circle = new Circle(x, y, radius, new WindowsAPI());

        // Input for Square
        int side = 50;
        Shape square = new Square(x + 100, y + 100, side, new LinuxAPI());

        // Draw Shapes
        circle.draw();
        square.draw();
    }
}
