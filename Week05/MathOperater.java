package Week05;
import java.util.Scanner;
public class MathOperater {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("กรุณาป้อนตัวเลข ");
        float a =kb.nextFloat();
        System.out.print("กรุณาป้อนตัวเลข");
        float b =kb.nextFloat();

        System.out.println("ค่าของตัวแปร a = " + a);
        System.out.println("ค่าของตัวแปร b = " + b);
        System.out.println("ผลบวก = " + (a+b));
        System.out.println("ผลลบ = " + (a-b));
        System.out.println("ผลคูณ = " + (a*b));
        System.out.println("ผลหาร = " + (a/b));
        System.out.println("ผลหารเอาเศษ = " + (a%b));
    kb.close();
    } 
}