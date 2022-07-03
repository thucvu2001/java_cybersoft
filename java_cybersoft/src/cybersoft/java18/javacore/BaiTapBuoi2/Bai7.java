package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> uocSo = new TreeSet<>();
        int n = sc.nextInt(); // nhap vao 1 so can tim cac uoc
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                uocSo.add(i);
                if (i != n / i) {
                    uocSo.add(n / i);
                }
            }
        }
        for (int x : uocSo) {
            System.out.print(x + " ");
        }
    }
}
