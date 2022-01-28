package thirtyDaysOfCode;

import java.util.*;
import java.io.*;

public class MapsDictionaries {

    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.get(s) == null){
                System.out.println("Not found");
            }else{
                System.out.println(s + "=" + phoneBook.get(s));
            }
            // Write code here
        }
        in.close();
    }
}
