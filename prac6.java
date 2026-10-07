import java.util.Scanner;
import java.util.Arrays;


public class prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        
        int pref[] = new int[len];
        pref[0] = arr[0];
        
        for(int i = 1; i < len; i++){
            pref[i] = pref[i-1] + arr[i];
            System.out.println(pref[i]);
        }
        
        System.out.println( Arrays.toString(pref));
    }
}
