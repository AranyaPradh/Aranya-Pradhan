import java.util.Scanner;

public class Calculator {
    double a, b;
    String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
        }
    }

    public static void main(String[] args) {
        double a = 10.5;
        double b = 2.5;
        String operation = "multiply";

        System.out.println("Example Inputs:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Operation = " + operation);

        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();
    }
}

 
