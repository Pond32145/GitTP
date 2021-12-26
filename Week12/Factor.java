package Week12;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       System.out.print("Enter number : ");
       int number = kb.nextInt();
        int i = number;
        int result=1;

        System.out.print( number+" ! ==> ");
        while (i >=1) {
            if (i==number) {
                System.out.print(i);

            } else {
                System.out.print("x"+i);

            }

            result = result*i;
            i--;

        }
        System.out.println(" = " +result );
        kb.close();
    }
}