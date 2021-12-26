package Week15;

public class Array_LoopData {
    public static void main(String[] args) {
        String [] car = {"BMW","ford","Toyota","Tesla"};
        //วนลูปแสดงค่าข้อมูลในอาเรย์
        for (int i = 0; i < car.length; i++) {
            System.out.println("สมาชิกตำแหน่งที่ "+i+" "+car[i]);
        }

        for (int i = 0; i < car.length; i++) {
            System.out.println("สมาชิกลำดับที่ "+(i+1)+" "+car[i]);
        }
        //System.out.println(car[0]);
        //System.out.println(car[1]);
        //System.out.println(car[2]);
        //System.out.println(car[3]);
    }
}
