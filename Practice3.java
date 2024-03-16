package Week3;
import java.util.Scanner;

public class Practice3 {
    public static void main( String[] args ){
        /*Practice 3
        Display factorial value of n entered by the user. */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=input.nextInt(), factorial=1, i=1;

        while(i<=n)factorial*=i++;

        System.out.printf("%d\n", factorial);

        
    }
}
