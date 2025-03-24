import java.util.Scanner;

public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left++) != cleanText.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public void displayResult() {
        System.out.println("\"" + text + "\" is " + (isPalindrome() ? "" : "not ") + "a palindrome.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();
        scanner.close();
    }
}