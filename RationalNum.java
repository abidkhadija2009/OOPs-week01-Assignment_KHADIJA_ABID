public class RationalNum {
    private int numerator;
    private int denominator;

    // Default Constructor (0 / 1)
    public RationalNum() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Parameterized Constructor
    public RationalNum(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }

        // Keep the denominator positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        if (numerator == 0) {
            this.numerator = 0;
            this.denominator = 1; // Standard representation of zero
        } else {
            int hcf = gcd(Math.abs(numerator), denominator);
            this.numerator = numerator / hcf;
            this.denominator = denominator / hcf;
        }
    }

    // Helper method to calculate Greatest Common Divisor (GCD / HCF)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Addition
    public RationalNum add(RationalNum other) {
        int num = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int den = this.denominator * other.denominator;
        return new RationalNum(num, den);
    }

    // Subtraction
    public RationalNum subtract(RationalNum other) {
        int num = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int den = this.denominator * other.denominator;
        return new RationalNum(num, den);
    }

    // Multiplication
    public RationalNum multiply(RationalNum other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new RationalNum(num, den);
    }

    // Division
    public RationalNum divide(RationalNum other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero rational number.");
        }
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new RationalNum(num, den);
    }

    // Convert to double value
    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    // Check equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RationalNum other = (RationalNum) obj;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    // String representation
    @Override
    public String toString() {
        if (this.numerator == 0) {
            return "0";
        } else if (this.denominator == 1) {
            return String.valueOf(this.numerator);
        } else {
            return this.numerator + " / " + this.denominator;
        }
    }
}
