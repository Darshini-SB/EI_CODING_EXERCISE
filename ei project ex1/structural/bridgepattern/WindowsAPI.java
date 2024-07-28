public class WindowsAPI implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius, ShapeDrawer drawer) {
        drawer.drawCircle(x, y, radius, "Windows");
    }

    @Override
    public void drawSquare(int x, int y, int side, ShapeDrawer drawer) {
        drawer.drawSquare(x, y, side, "Windows");
    }
}
