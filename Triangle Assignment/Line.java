 public class Line {
    private Point A;
    private Point B;

    // Default Constructor
    public Line() {
        this.A = new Point();
        this.B = new Point();
    }

    // Parameterized Constructor
    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    // Constructor with coordinates
    public Line(int x1, int y1, int x2, int y2) {
        this.A = new Point(x1, y1);
        this.B = new Point(x2, y2);
    }

    // Add two Lines
    public Line add(Line obj) {
        Point newA = this.A.add(obj.A);
        Point newB = this.B.add(obj.B);
        return new Line(newA, newB);
    }

    // Subtract two Lines
    public Line subtract(Line obj) {
        Point newA = this.A.subtract(obj.A);
        Point newB = this.B.subtract(obj.B);
        return new Line(newA, newB);
    }

    @Override
    public String toString() {
        return "A = " + A + ", B = " + B;
    }
}