import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        
        int repElem = -1;
        for (int i = 0; i < len; i++) {
            System.out.println("Current index" + arr[i]);
            for (int j = i + 1; j < len; j++ ){
                if (arr[i] == arr[j]){
                    repElem = arr[i];
                    break;
                }
            }
            if(repElem != -1) {
                System.out.println("First repeating number is " + repElem);
                break;
            }
        }
    }    
}    