package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // nhap vao so n can tinh tong chu so
        int tongChuSo = 0;
        while (n != 0) {
            tongChuSo += n % 10;
            n /= 10;
        }
        System.out.println(tongChuSo);
    }
}
