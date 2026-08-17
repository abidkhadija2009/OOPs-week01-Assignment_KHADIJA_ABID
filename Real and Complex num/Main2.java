public class Main2 {
    public static void main(String[] args) {
        RationalNum r1 = new RationalNum(2, 4);  // Automatically simplifies to 1/2
        RationalNum r2 = new RationalNum(3, -6); // Simplifies to -1/2

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("---------------------------");

        System.out.println("Sum: " + r1.add(r2));
        System.out.println("Difference: " + r1.subtract(r2));
        System.out.println("Product: " + r1.multiply(r2));
        System.out.println("Division: " + r1.divide(r2));

        System.out.println("r1 as double: " + r1.toDouble());
        System.out.println("r1 equals r2? " + r1.equals(r2));
    }
}