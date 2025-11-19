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
            printMenu();
            do {
                input = sc.nextLine();
            } while (!input.matches("^([1-6]|:q!)$"));
            switch (input) {
                case "1" -> {
                    System.out.println("Add:");
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.add(a, b);
                    System.out.println(result);
                }
                case "2" -> {
                    System.out.println("Sub:");
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.subtract(a, b);
                    System.out.println(result);
                }
                case "3" -> {
                    System.out.println("Mul:");
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.multiply(a, b);
                    System.out.println(result);
                }
                case "4" -> {
                    System.out.println("Div:");
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.divide(a, b);
                    System.out.println(result);
                }
                case "5" -> {
                    System.out.println("Sqr:");
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();

                    try {
                        result = Calculate.squareRoot(a);
                        System.out.println(result);
                    } catch (NegativeNumberException e) {
                        System.out.println("can't do sqrt of number < 0");
                    }
                }
                case "6" -> {
                    System.out.println("Pow:");
                    System.out.println("Bitte Zahl 1: ");
                    a = sc.nextDouble();
                    System.out.println("Bitte Zahl 2: ");
                    b = sc.nextDouble();

                    result = Calculate.power(a, (int) b);
                    System.out.println(result);
                }
                case ":q!" -> {
                    run = false;
                }
            }
        }
    }

    static void printMenu() {
        System.out.println("""
                
                what's on your mind?
                1   -> add
                2   -> subtract
                3   -> multiply
                4   -> divide
                5   -> squareRoot
                6   -> power
                :q! -> close down program
                """);

    }
}
