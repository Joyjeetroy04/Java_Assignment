import java.math.BigInteger;
import java.util.Scanner;

public class FactorialDigitSum {

    // Method to calculate factorial of a number
    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method to calculate the sum of the digits of a BigInteger
    public static int sumOfDigits(BigInteger number) {
        int sum = 0;
        String numStr = number.toString(); // Convert BigInteger to String for easy digit access
        for (char digit : numStr.toCharArray()) {
            sum += Character.getNumericValue(digit); // Convert each character to an integer and add to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculating the factorial of the number
        BigInteger factorialResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);

        // Calculating the sum of the digits of the factorial result
        int digitSum = sumOfDigits(factorialResult);
        System.out.println("Sum of the digits of the factorial: " + digitSum);

        scanner.close();
    }
}
