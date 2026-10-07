import java.util.Scanner;

public class prac1{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       String inpStr = sc.next();

       String revStr = "";


       for(int i =inpStr.length() - 1; i>=0; i--){
        revStr += inpStr.charAt(i);
        System.out.println(i);
       }

       System.out.println("Reversed String:"+revStr);
    }
}


