package Week05;
import java.util.Scanner;

public class inputDataFromKeyboard {
    public static void main(String[] args) {
//nextByte  
//nextShort
//nextInt
//nextLong
//nextFloat
//nextDouble  
      Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนรหัสนักศึกษา : ");
        String id = kb.nextLine();
        System.out.print("กรุณาป้อนชื่อ-นามสกุล : ");
        String name = kb.nextLine();
        System.out.print("กรุณาป้อนอายุ\t    : ");
        short age = kb.nextShort();
        System.out.print("กรุณาป้อนเกรดเฉลี่ย  : ");
        float gpa = kb.nextFloat();

        System.out.println("\nรหัสประจำตัวที่ป้อนคือ : "+id); //Your Enter is
        System.out.println("ชื่อ-นามสกุลที่ป้อนคือ  :"+name);
        System.out.println("อายุที่ป้อนคือ\t      : "+age); //Your Enter is
        System.out.println("เกรดที่ป้อนคือ\t     :"+gpa);
        
         kb.close();
    }
}
