package Week3;
import java.util.Scanner;

public class Practice8 {
    public static void main( String[] args ){
        /*Practice 8
        Display the base-2 system equivalent of a number entered by the user as base-10 system in real order. */

        Scanner input=new Scanner(System.in);

        System.out.printf("Enter a number in base-10: ");
        int n=input.nextInt(), temp=2*n, counter=0;

        while((temp/=2)>=1)
            counter++;
        int i=counter+1, j=1;
        while(i-->1){
            temp=n;
            while(j++<i) temp/=2;
            System.out.printf("%d", temp%2);
            j=1;
        }
    }
}
