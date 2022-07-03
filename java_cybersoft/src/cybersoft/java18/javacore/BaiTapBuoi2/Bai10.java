package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai10 {
    static boolean[] prime = new boolean[10001];

    public static void sangSoNguyenTo() {
        for (int i = 0; i <= 10000; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i <= 100; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 10000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sangSoNguyenTo();
        int n = sc.nextInt(); // nhap vao so n de tinh tong cac so nguyen to tu 1 den n
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            if (prime[i]) {
                tong += i;
            }
        }
        System.out.println(tong);
    }
}
