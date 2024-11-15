import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of Fibonacci terms
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize an array to store Fibonacci terms
            int[] fibonacci = new int[n];

            // Generate Fibonacci sequence
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    fibonacci[i] = 0; // First term
                } else if (i == 1) {
                    fibonacci[i] = 1; // Second term
                } else {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Subsequent terms
                }
            }

            // Print the Fibonacci sequence
            System.out.print("The first " + n + " terms of the Fibonacci sequence are: ");
            for (int num : fibonacci) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
