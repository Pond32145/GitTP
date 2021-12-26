package Week11;

public class WhileTrue_01 {
    public static void main(String[] args) {
        
        int i =0; //ค่าเริ่มต้น
        while (true) {
            
            System.out.println("รอบที่ "+i);//เงื่อนไข
            i++;
            //updateรอบ //หรือi+=2;
            if (i>100) break;
        }
    }
}           