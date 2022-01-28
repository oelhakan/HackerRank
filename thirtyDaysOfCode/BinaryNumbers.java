package thirtyDaysOfCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BinaryNumbers {
    //Given a base-10 integer, n, convert it to binary (base-2).
    // Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
    // When working with different bases, it is common to show the base as a subscript.

    //The binary representation of base-10 5 is base-2 101, so the maximum number of consecutive 1's is 1.
    //The binary representation of base-10 13 is base-2 1101, so the maximum number of consecutive 1's is 2.

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());



        System.out.println(getConsecutiveOnes(Integer.toBinaryString(n)));

        bufferedReader.close();
    }

    public static int getConsecutiveOnes(String str){
        String[] out = str.split("(?<=(.))(?!\\1)");

        String max = "";
        for(int i = 0; i<out.length; i++){
            if(out[i].length()>max.length() && out[i].contains("1")){
                max = out[i];
            }
        }
        return max.length();
    }
}
