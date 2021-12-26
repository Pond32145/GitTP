package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        //การประกาศตัวแปลด้วย Array
        // แบบที่1 ประกาศตัวแปรแบบกำหนดสมาชิก
        int [] number = {1,2,3,49,3,4,55,4,32,10}; 

        int size = number.length;
            System.out.println(size);   //หาความยาวของอาเรย์
            System.out.println(number[3]);  //การเข้าถึงตำแหน่งของตัวแปล
            number[2]=99;   //การเปลี่ยนค่าข้อมูล
            System.out.println(number[3]);
            System.out.println(number[1]+number[3]);
        //แบบที่2 ประกาศแบบกำหนดขนาด
        //char [] alphabet;   //ประกาศอาเรย์
        //alphabet = new char[26];   //สร้างอาเรย์

        char [] alphabet = new char[4];//ประกาศและสร้างอาเรย์
        alphabet [0]='a';
        alphabet [1]='b';
        alphabet [2]='c';
        System.out.println(alphabet[2]);
        System.out.println(alphabet[3]);
        System.out.println(alphabet.length);

        int []num = new int[10];
        System.out.println(num[9]);
    }
}
