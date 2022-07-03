package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Random;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int number = rd.nextInt(999) + 1;
        System.out.println(number);
        int n;
        while(true){
            n = sc.nextInt();
            if(n == number){
                System.out.println("Chinh Xac");
                break;
            } else {
                if( n < number){
                    System.out.println("Nho hon");
                } else {
                    System.out.println("Lon hon");
                }
            }
        }
    }
}
