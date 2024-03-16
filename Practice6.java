package Week3;

public class Practice6 {
    public static void main( String[] args ){
        /*Practice 6
        Display even natural numbers from 2 to 100 as 5 numbers per line by using while statement. */

        int i=0, j=0;

        do{
            do System.out.printf("%-5d", i+(j+=2));
            while(j<9);
            System.out.println();
            j=0;
            i+=10;
        }while(i<100);
    }
}
