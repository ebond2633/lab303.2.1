import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter your second number:");
        int secondNumber = scanner.nextInt();

        // Ensure the smaller number is used for division
        int smallerNumber = Math.min(firstNumber, secondNumber);

        // Calculate the result
        double result = (double) firstNumber / smallerNumber;

        System.out.println("Result of dividing the larger number by the smaller number: " + result);
    }

}
