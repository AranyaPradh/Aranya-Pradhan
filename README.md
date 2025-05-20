coding language:java
problem1:
import java.util.Scanner;

public class Calculator {
    double a, b;
    String operation;

    // Constructor to initialize values
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();  // Convert operation to lowercase for consistency
    }

    // Method to perform the selected operation
    public void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));  // Addition
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));  // Subtraction
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));  // Multiplication
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));  // Division
                } else {
                    System.out.println("Error: Division by zero");  // Handle divide by zero
                }
                break;
            default:
                System.out.println("Error: Invalid operation");  // Invalid input
        }
    }

    // Main method to take input and run the calculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();  // Input for a

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();  // Input for b

        scanner.nextLine(); // Consume leftover newline
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();  // Input operation

        Calculator calc = new Calculator(a, b, operation);  // Create Calculator object
        calc.calculate();  // Perform calculation

        scanner.close();  // Close scanner
    }
}
//.....................................................................................................................
problem2:
import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();  // Read the input number

        // Loop to generate and print the first 'a' odd numbers
        for (int i = 0; i < a; i++) {
            // Calculate and print the odd number (2 * i + 1)
            System.out.print(2 * i + 1);

            // Print a comma after each number except the last one
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
//...................................................................................................
problem3:
import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create scanner object to take user input
        int a = scanner.nextInt();  // Read an integer input

        // If 'a' is even, reduce it by 1 to make count odd; otherwise keep it the same
        int count = (a % 2 == 0) ? a - 1 : a;

        int num = 1;  // Start from the first odd number

        // Loop to print 'count' odd numbers
        for (int i = 0; i < count; i++) {
            System.out.print(num);  // Print current odd number

            // Print comma after the number, except after the last one
            if (i < count - 1) {
                System.out.print(", ");
            }

            num += 2;  // Move to the next odd number
        }

        scanner.close();  // Close the scanner
    }
}
//............................................................
problem4:
import java.util.*;

public class MultipleCounter {

    // Method to count how many numbers are divisible by each divisor
    public static Map<Integer, Integer> countMultiples(List<Integer> numbers, List<Integer> divisors) {
        Map<Integer, Integer> result = new LinkedHashMap<>();  // Stores each divisor and its count

        for (int d : divisors) {
            int count = 0;

            // Count how many numbers are divisible by the current divisor
            for (int num : numbers) {
                if (num % d == 0) {
                    count++;
                }
            }

            result.put(d, count);  // Store result in the map
        }

        return result;  // Return the final map
    }

    public static void main(String[] args) {
        // List of numbers to check
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        // Divisors to test for multiples
        List<Integer> divisors = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Call method and store the result
        Map<Integer, Integer> output = countMultiples(numbers, divisors);

        // Print the result
        System.out.println(output);
    }
}

