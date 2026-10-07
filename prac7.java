import java.util.Scanner;
import java.util.Arrays;


public class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        
        for( int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }        

        System.out.println(Arrays.deepToString(arr));
    }    
}