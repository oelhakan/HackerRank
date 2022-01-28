package java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }

        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);

        return java.util.Arrays.equals(arrA,arrB);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }


}
