package Week11;
import java.util.Scanner;
public class WhileTrue_Kb {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        while (true) { 
            
            System.out.print("Enter Num : ");
            int num = kb.nextInt();
            if (num==9){
                break;
            } 
        }kb.close();
    }
}