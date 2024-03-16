package Week3;
import java.util.Scanner;

public class Practice7 {
    public static void main( String[] args ){
        /*Practice 7
        Display the base-2 system equivalent of a number entered by the user as base-10 system in reverse order. */

        Scanner input=new Scanner(System.in);

        System.out.printf("Enter a number in base-10: ");
        int n=2*input.nextInt();

        while(n>1){
            System.out.printf("%d", ((n/=2)%2));
        }
    }
}
