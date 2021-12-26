package Week06;
import java.util.Scanner;
public class Area4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        int x = kb.nextInt();
        System.out.print("");
        int y = kb.nextInt();
        
        int z = x*y;

        System.out.println(" = "+x  + " x" +  y + " = "+ z);
    kb.close(); 
    }
}
