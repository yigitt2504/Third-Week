package Week3;

public class Practice5 {
    public static void main( String[] args ){
        /*Practice 5
        Display odd natural numbers from 1 to 99 as 5 numbers per line by using while statement. */

        int i=0, j=-1;
        
        do{
            do System.out.printf("%-5d", i+(j+=2));
            while(j<9);
            System.out.println();
            j=-1;
            i+=10;
        }while(i<100);
        
}   }
