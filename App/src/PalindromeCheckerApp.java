/**
 * Use Case 3: Reverse String Based Palindrome Check
 *  @author Rachita
 *  @version 3.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
