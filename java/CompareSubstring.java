package java;

public class CompareSubstring {
    public static void main(String[] args) {
        String s1 = "welcometojava";
        System.out.println(getSmallestAndLargest(s1,3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        java.util.List<String> subStrings = new java.util.ArrayList<>();

        for(int i = 0; i<=s.length()-k; i++){
            subStrings.add(s.substring(i, i+k));
        }

        java.util.Collections.sort(subStrings);

        String smallest = subStrings.get(0);
        String largest = subStrings.get(subStrings.size()-1);

        return smallest + "\n" + largest;
    }
}
