package Week17;

public class Method_ex3 {
    public static void main(String[] args) {
        // method แบบที่ 3  ไม่มีการรับค่าที่ส่งมาจาก main program  แต่ลูกส่งค่าออกคืนแม่ 
       int phone = getPhoneNumber();
       int lucky = 999;
       int newphone = phone+lucky;
       System.out.println(newphone);
    }
    static int getPhoneNumber(){
        return 983767029;
    }
}
