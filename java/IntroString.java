package java;

import java.util.Scanner;

public class IntroString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A= "java";
        String B= "hello";
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.compareTo(B));
        System.out.println(sumLength(A,B));
        System.out.println(checkAlphabetical(A,B));
        System.out.println(capitalizeAndPrint(A + " " + B));
    }

    public static int sumLength(String a, String b){
        return a.length() + b.length();
    }

    public static String checkAlphabetical(String a, String b){
        if(a.compareTo(b) > 0){
            return "Yes";
        }else{
            return "No";
        }
    }

    public static char[] capitalizeAndPrint(String s){
        //capitalize first
        char[] arr = s.toCharArray();
        char tempChar = Character.toUpperCase(arr[0]);
        arr[0] = tempChar;

        //capitalize after space
        for(int i = 1; i<s.length(); i++){
            if(arr[i-1] == ' '){
                tempChar = arr[i];
                arr[i] = Character.toUpperCase(tempChar);
            }
        }

        return arr;
    }
}
