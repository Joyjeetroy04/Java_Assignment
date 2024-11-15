import java.util.Scanner;

public class CharacterCounter {

    // Method to count occurrences of a character in a string
    public static int countCharacterOccurrences(String input, char character) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Accept a character to search for
        System.out.print("Enter a character to search for: ");
        char character = scanner.next().charAt(0);

        // Count occurrences of the character
        int count = countCharacterOccurrences(input, character);

        // Display the count
        System.out.println("The character '" + character + "' occurs " + count + " times in the string.");

        scanner.close();
    }
}
