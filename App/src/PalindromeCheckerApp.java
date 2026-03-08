
public class UseCase2PalindromeCheckerApp {


    public static void main(String[] args) {
        // Step 1: Hardcoded string literal
        String input = "madam";
        boolean isPalindrome = true;
        int length = input.length();

        // Step 2: Comparison logic using the hint (looping until half length)
        //         for (int i = 0; i < length / 2; i++) {
        // Compare character at index i with character at the mirrored index from the end
        if (input.charAt(i) != input.charAt(length - 1 - i)) {
            isPalindrome = false;
            break; // Exit loop early if a mismatch is found
        }
    }

    // Step 3: Print the result to the console
        if (isPalindrome) {
        System.out.println("The string '" + input + "' is a palindrome.");
    } else {
        System.out.println("The string '" + input + "' is NOT a palindrome.");
    }
}
}