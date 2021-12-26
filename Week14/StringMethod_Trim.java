package Week14;

public class StringMethod_Trim {
    public static void main(String[] args) {
        String fullname = "   Suksawat saelim   ";

        int result = fullname.length();
        System.out.println(result);

        // .trim()  ตัดช่องว่างหน้าหลังออก
        String a = fullname.trim();
        System.out.println(a);
        System.out.println(a.length());

        //.indexOf()
        System.out.println(fullname.indexOf("sa",9));

        // .toUpperCase()ตัวใหญ่  .tolowerCase() ตัวเล็ก
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        // .substring() การตัดคำที่ต้องการ
        String uni = "Nakhon Pathom Rajabhat University";
        System.out.println(uni.substring(5,11));
        
    }
}