package problemSolving;

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
     * Complete the 'filledOrders' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY order
     *  2. INTEGER k
     */

    public static int filledOrders(List<Integer> order, int k) {
        int maxPossible = 0;
        int temp = 0;

        //10 30, 40

        for (int i = 0; i < order.size(); i++) {
            if(order.get(i) <= k-temp) {
                maxPossible++;
                temp += order.get(i);
            }
        }

        return maxPossible;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int orderCount = scanner.nextInt();

        List<Integer> order = new ArrayList<>();


        for (int i = 0; i < orderCount; i++) {
            order.add(scanner.nextInt());
        }

        //System.out.println("Orders : " + order);
        int k = scanner.nextInt();

        //System.out.println("Available Widgets : " + k);

        int result = Result.filledOrders(order, k);
        System.out.println(result);
    }
}
