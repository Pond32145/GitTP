package Week17;

public class Array_fieEach {
    public static void main(String[] args) {
         String [] name = {"นายสมชาย","นางสาวสมหญิง","นางสมนึก","นางสาวสมใจ","นายสมดี"};
         System.out.println("มีรายชื่อทั้งหมด "+name.length+ " คน ประกอบด้วย");
         int i = 1;
         for (String shoename : name) {
                System.out.println(i+". "+shoename);
                i++;
            }

            int [] number= {1,2,3,4,5,6,7,8,9};
            int sum =0;
                for (int j : number) {
                     sum = sum + j;
                        
                }System.out.println(sum);
        //     for (int i = 0; i < name.length; i++) {
        //         boolean result = name[i].startsWith("นาย");
        //         if (result) {
        //             System.out.println((i+1)+". "+name[i]+" ==> เป็นเพศชาย");
        //         } else {
        //             System.out.println((i+1)+". "+name[i]+" ==> เป็นเพศหญิง");
        //     }
        // }
    }
}