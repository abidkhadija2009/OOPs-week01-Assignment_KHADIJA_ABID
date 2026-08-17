public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    // Default Constructor
    public Triangle() {
        this.A = new Point(0, 0);
        this.B = new Point(1, 0);
        this.C = new Point(0, 1);
    }

    // Constructor with 3 Point objects
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // Constructor using coordinates directly
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.A = new Point(x1, y1);
        this.B = new Point(x2, y2);
        this.C = new Point(x3, y3);
    }

    // Get side AB as a Line object
    public Line getSideAB() {
        return new Line(A, B);
    }

    // Get side BC as a Line object
    public Line getSideBC() {
        return new Line(B, C);
    }

    // Get side CA as a Line object
    public Line getSideCA() {
        return new Line(C, A);
    }

    // Getters for individual Points
    public Point getA() { return A; }
    public Point getB() { return B; }
    public Point getC() { return C; }

    @Override
    public String toString() {
        return "Triangle [A=" + A + ", B=" + B + ", C=" + C + "]";
    }
}