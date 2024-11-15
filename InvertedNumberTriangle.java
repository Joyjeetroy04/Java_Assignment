import java.util.Scanner;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of rows for the triangle
        System.out.print("Enter the number of rows for the inverted triangle: ");
        int n = scanner.nextInt();

        // Generate and print the inverted triangle
        for (int i = n; i >= 1; i--) {
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
