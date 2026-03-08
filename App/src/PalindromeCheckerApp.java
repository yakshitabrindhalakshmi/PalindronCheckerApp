import java.util.Stack;


public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c); // Characters are added to the top
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string and compare with popped values
        for (char c : input.toCharArray()) {
            // Pop returns the most recently pushed character (LIFO)
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display the output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

