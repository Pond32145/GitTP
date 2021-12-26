package Week11;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("");
        int n =kb.nextInt();
        System.out.print(n+"!=");
        int num=1;
        for (int i = 1; i <=n; i++) {
        
            num=num*i;
            System.out.print(i+" x ");
          
        }System.out.println(" = "+num);
        
       kb.close();
    }
 
} 