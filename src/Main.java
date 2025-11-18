import java.util.Scanner;

public class Main {
    static void main() throws NegativeNumberException {
        double result;
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        boolean run = true;
        while (run) {
            String input;
            input = sc.nextLine();


            switch (input) {
                case "1" -> {
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.add(a, b);
                    System.out.println(result);
                }
                case "2" -> {
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.subtract(a, b);
                    System.out.println(result);
                }
                case "3" -> {
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.multiply(a, b);
                    System.out.println(result);
                }
                case "4" -> {
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.divide(a, b);
                    System.out.println(result);
                }
                case "5" -> {
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();

                    result = Calculate.squareRoot(a);
                    System.out.println(result);
                }
                case "6" -> {
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.power(a, (int) b);
                    System.out.println(result);
                }
                case null, default -> {
                }
            }

        }


        try {
            result = Calculate.squareRoot(-5);
            System.out.println(result);
        } catch (NegativeNumberException e) {
            throw new NegativeNumberException();
        }
    }
}
