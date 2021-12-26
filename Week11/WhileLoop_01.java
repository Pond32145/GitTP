package Week11;

public class WhileLoop_01 {
    public static void main(String[] args) {
        
        int i =2; //ค่าเริ่มต้น
        while (i<=20) {
            System.out.print(i++ +" ");//เงื่อนไข
            i++;//updateรอบ //หรือi+=2;
        }
    }
}