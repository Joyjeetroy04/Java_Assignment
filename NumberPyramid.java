import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of rows for the pyramid
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();

        // Generate and print the pyramid
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
