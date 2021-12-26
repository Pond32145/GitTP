package Week14;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นายสมชาย เข็มขัด";

        //หาตำแหน่งของคำ .startWith()
         boolean result = fullname.startsWith("นาย");
         if (result) {
             System.out.println(fullname+" ชาย");
         } else {
             System.out.println(fullname+" หญิง");
         }
        
         //หาค่าตำแหน่งของคำจากด้านหลัง .endWith

         String code = "13432TH";
         boolean result2 = code.endsWith("TH");
         if (result2) {
            System.out.println("สินค้า "+code+" ส่งมากจากประเทศไทย");
        } else {
            System.out.println("สินค้ารหัส "+code+" ไม่ได้ส่งมาจากประเทศไทย");
        }

    }
}
