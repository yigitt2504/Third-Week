package Week3;

public class Practice4 {
    public static void main( String[] args ){
        /*Practice 4
        Display all natural numbers from 1 to 100 as 10 numbers per line by using while statement. */

        int i=0, j=1;
        while(i<100){
            while(j<=10)
                System.out.printf("%d\t", (i+j++));
            System.out.println();
            j=1;
            i+=10;
        
    }
}}
