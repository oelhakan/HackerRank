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

public class TwoDArrays {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int res = findMaxSum(arr);

        System.out.println(res);

    }

    static int findMaxSum(List<List<Integer>> arr) {
        int R = arr.size();
        int C = arr.get(0).size();
        if (R < 3 || C < 3)
            return -1;

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                int sum = (arr.get(i).get(j) + arr.get(i).get(j + 1) +
                        arr.get(i).get(j + 2)) + (arr.get(i + 1).get(j + 1)) +
                        (arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) +
                                arr.get(i + 2).get(j + 2));
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
}
