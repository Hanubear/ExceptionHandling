public class Calculate {
    NegativeNumberException negativeNumberException = new NegativeNumberException();
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double squareRoot(double a) throws NegativeNumberException {
        if (a<0) throw new NegativeNumberException();
        return Math.sqrt(a);
    }

    static double power(double a, int b) {
        return Math.pow(a, b);
    }

}
