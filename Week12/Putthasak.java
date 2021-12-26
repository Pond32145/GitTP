package Week12;
import java.util.Scanner;
                            // แปลง ค.ศ.ให้เป้น พ.ศ. 
public class Putthasak {
    public static void main(String[] args) {
        System.out.println("*****ยินดีต้อนรับสู่โปรแกรมเปลี่ยน ค.ศ.เป็น พ.ศ.*****"+"\n\t\tกด 0 เพื่อจบกานทำงาน");
        Scanner kb = new Scanner(System.in);
        while(true){
            System.out.print("\tกรุณากรอก ค.ศ. ");
            int i = kb.nextInt();
            if (i==0) {
                break;
            }
            System.out.println("\tค.ศ. "+i+" คือ พ.ศ. "+(i-543));
            }System.out.println("\t\t End of Program");
        kb.close();  
    }
}