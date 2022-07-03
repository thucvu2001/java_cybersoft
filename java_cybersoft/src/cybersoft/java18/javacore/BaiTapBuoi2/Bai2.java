package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai2 {
    public static void NhiPhan(int n) {
        if (n == 0) {
            return;
        } else {
            NhiPhan(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n la so thap phan, can chuyen sang nhi phan
        NhiPhan(n);
    }
}
