public class ComplexNumber {
    // Member variables
    private double real;
    private double imaginary;

    // Default Constructor (0 + 0i)
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Parameterized Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Add two Complex Numbers: (a + bi) + (c + di) = (a+c) + (b+d)i
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Subtract two Complex Numbers: (a + bi) - (c + di) = (a-c) + (b-d)i
    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Multiply two Complex Numbers: (a + bi)(c + di) = (ac - bd) + (ad + bc)i
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    // Display method to convert complex number to printable string
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }

    // Main method to test and run
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 5);
        ComplexNumber c2 = new ComplexNumber(2, -4);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("-------------------------");

        ComplexNumber sum = c1.add(c2);
        ComplexNumber difference = c1.subtract(c2);
        ComplexNumber product = c1.multiply(c2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}