import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String inp = sc.next();
        
        int left = 0;
        int right = inp.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (inp.charAt(left) != inp.charAt(right)) {
                isPalindrome = false;
                break; 
            }
            left++;
            right--;
        }
        
        if(isPalindrome) {
            System.out.println("String is pallindrome");
        } else {
            System.out.println("String is not pallindrome");
        }

    }
}