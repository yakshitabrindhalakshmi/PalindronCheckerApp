
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Predefined string
        String input = "radar";
        String reversed = "";

        // Step 2: Iterate from the last character to the first
        // Hint: for (int i = input.length() - 1; i >= 0; i--)
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Building the reversed string character by character
        }

        // Step 3: Compare original and reversed strings
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}