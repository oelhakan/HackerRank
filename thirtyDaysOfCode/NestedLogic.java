package thirtyDaysOfCode;

import java.io.*;
import java.util.*;

public class NestedLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int returnDay = scanner.nextInt(), returnMonth=scanner.nextInt(), returnYear = scanner.nextInt(), dueDay = scanner.nextInt(), dueMonth = scanner.nextInt(), dueYear = scanner.nextInt(), fine;

        if(dueYear < returnYear){
            fine = 10000;
        }else if(returnYear == dueYear && dueMonth < returnMonth){
            fine = 500 * (returnMonth - dueMonth);
        }else if(returnMonth == dueMonth && dueDay < returnDay){
            fine = 15 * (returnDay - dueDay);
        }else {
            fine = 0;
        }

        System.out.println(fine);
//        System.out.println("Returned : " + returnDay + " " + returnMonth + " " + returnYear);
//        System.out.println("Due : " + dueDay + " " + " " + dueMonth + " " + dueYear);
    }
}
