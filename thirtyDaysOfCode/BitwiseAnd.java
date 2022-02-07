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

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int max = 0;
        int check = 0;
        for(int i = 0; i<N; i++){
            for(int j = i+1; j<=N; j++){
                check = i & j;
                if(check > max && check < K){
                    max = check;
                }
            }
        }
        return max;
    }

}

public class BitwiseAnd {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t > 0){
            int count = scanner.nextInt();

            int lim = scanner.nextInt();

            int res = Result.bitwiseAnd(count, lim);

            System.out.println(res);

            t--;
        }
        scanner.close();
    }
}
