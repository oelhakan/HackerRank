package thirtyDaysOfCode;

import java.util.Scanner;

public class RunningTimeAndComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        while(testCases>0){
            if(isPrime(scanner.nextInt())){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
            testCases--;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
