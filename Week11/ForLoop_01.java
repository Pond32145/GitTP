package Week11;
public class ForLoop_01 {
    public static void main(String[] args) {
        
        // int i =0; //ค่าเริ่มต้น
        // while (true) {
            
        //     System.out.println("รอบที่ "+i);//เงื่อนไข
        //     i++;
        //     //updateรอบ //หรือi+=2;
        //     if (i>100) break;
        // }
            int sum=0;
        for (int i = 1; i <10; i++) {
             sum=sum+i;
             System.out.println("รอบที่ "+ i+" ผลบวกเท่ากับ "+sum);
        }
            System.out.println("รวมเท่ากับ "+sum);
        // for (int i = 1; i <= 100; i++) {
        //     System.out.println("รอบที่ "+i+"java");
        // }
    }
}     
            
      