package Week12;

public class NestedLoop {
    public static void main(String[] args) {
        
        for (int i = 2; i <=3; i++) {// loopนอก แม่สูตรคูร
            for (int j = 1; j <=12; j++) {// loopใน จำนวนครั้งที่จะคูณในแต่ล่ะแม่
                System.out.println(i+" x "+j+"="+(i*j));
        }
        }
    }
}
