package Week3;
import java.util.Scanner;

public class Practice2 {
    public static void main( String[] args )
    {
        /*Practice 2
        Display the sum of natural numbers until n entered by the user. */

        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=read.nextInt();
        
        if (n<=0) {
            System.out.println("Enter a number: ");
        } 
        else {
            int sum=0;
            int i=1;

        while (i <= n) {
                sum += i;
                i++;
            }
        
            System.out.println("The sum of natural numbers until "+ n +" is: " + sum);
        
        }
    }
}
