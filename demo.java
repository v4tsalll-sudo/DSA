class Main {
    public static void countOccurrences(String str1, String str2) {
        String arr[] = str1.split("");

        int count = 0;
        for(int i = 0; i < arr.length; i++ ) {
            if(arr[i] == str2) {
                count++;
            }
        }

        System.out.println(count);
    }
}    

// You are using Java

import java.util.Scanner; 

public class Main(String[] args) {
    public static void main() {
        
        Scanner sc = Scanner(System.in);
        
        String str = sc.next();
        String str1 = sc.next();
        
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str1.toCharArray();
        
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        
        if(charArr1.toString() equals(charArr2.toString())) {
            System.out.println("Both are anargams")
        } else {
            System.out.println("Not anargams")
        }
        
    }
}
