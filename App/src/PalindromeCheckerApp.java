

public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize the input string
        String input = "radar";

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {
            // Compare characters at the current pointer positions
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Mismatch found, exit loop
            }
            // Move pointers toward the middle
            start++;
            end--;
        }

        // Display the output as shown in the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}