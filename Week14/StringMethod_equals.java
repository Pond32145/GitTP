package Week14;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Saelim";
        String lastname2 = "saelim";
         //เปรียบเทียบเท่ากัน .ecquals   
        boolean result = lastname1.equals(lastname2);
         System.out.println(result);
         
         //เปรียบเทียบเท่ากันโดยไม่สนใจอักษรตัวเล็กหรือใหญ่ .ecquals
         boolean result2 = lastname1.equalsIgnoreCase(lastname2);
         if (result2) {
             System.out.println(lastname1+" = "+lastname2);
         } else {
            System.out.println(lastname1+" != "+lastname2);
         }
    }
}
