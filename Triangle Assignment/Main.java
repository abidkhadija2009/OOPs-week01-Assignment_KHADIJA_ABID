public class Main {
    public static void main(String[] args) {
        // Creating initial Points
        Point P1 = new Point(1, 2);
        Point P2 = new Point(3, 4);

        Point temp = P1.add(P2);
        System.out.println("P1 + P2 = " + temp);

        // Additional Points for Lines
        Point P3 = new Point(5, 6);
        Point P4 = new Point(7, 8);

        // Creating Lines
        Line L1 = new Line(P1, P2);
        Line L2 = new Line(P3, P4);

        // Add Lines
        Line sum = L1.add(L2);

        // Subtract Lines
        Line difference = L1.subtract(L2);

        Line l1 = new Line(1, 2, 3, 5);
        System.out.println("l1: " + l1);

        // Output results
        System.out.println("Line 1: " + L1);
        System.out.println("Line 2: " + L2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}