public class Calculator {

    public static double calculate(double a, double b, char operator) {

        switch (operator) {

            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;

            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {

        double result = calculate(20, 5, '+');

        System.out.println("Result = " + result);
    }
}