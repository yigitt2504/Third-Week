package Week3;

public class Practice9 {
    public static void main( String[] args ){
        /*Practice 9
        Display the multiplication table until 10(as 10x10 table). */

        int i=0, j=0;
        while(i++<10){
            while(j++<10)
                System.out.printf("%dx%d=%d\t", i, j, (i*j));
            System.out.println();
            j=0;
    }}
}
