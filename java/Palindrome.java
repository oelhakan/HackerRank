package java;

public class Palindrome {
    public static void main(String[] args) {
        checkPalindrome("amgot");
        checkPalindrome("madam");
    }

    public static String reverse(String s) {
        char temp = ' ';

        String output = "";

        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            output = temp + output;
        }
        return output;
    }

    public static void checkPalindrome(String s) {
        if (s.equals(reverse(s))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
