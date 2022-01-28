package java;

public class Substring {
    public static void main(String[] args) {
        String text = "Helloworld";
        int start = 3;
        int end = 7;
        printSubstring(text,start,end);
    }
    public static void printSubstring(String text, int start, int end){
        for(int i = start; i<end; i++){
            System.out.print(text.charAt(i));
        }
    }
}
