package thirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference(){
        int temp = 0;
        //[1,2,5]
        for(int i = 0; i<this.elements.length; i++){
//            System.out.println("i : " + i);
            for(int j = 0; j<this.elements.length; j++){
//                System.out.println("j : " + j);
                if(Math.abs(this.elements[i] - this.elements[j]) > temp){
                    temp = Math.abs(this.elements[i] - this.elements[j]);
//                    System.out.println("temp : " + temp);
                }
            }
        }
        this.maximumDifference = temp;
    }

    // Add your code here

}

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
