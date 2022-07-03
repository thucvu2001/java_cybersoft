package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.printf("%d la mot nam nhuan.\n", year);
        } else {
            System.out.printf("%d khong phai la mot nam nhuan.\n", year);
        }
    }
}
