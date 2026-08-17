public class Point {
    private int x;
    private int y;

    // Default Constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Add two Points
    public Point add(Point obj) {
        int x = this.x + obj.x;
        int y = this.y + obj.y;
        return new Point(x, y);
    }

    // Subtract two Points
    public Point subtract(Point obj) {
        int x = this.x - obj.x;
        int y = this.y - obj.y;
        return new Point(x, y);
    }

    // toString Method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}