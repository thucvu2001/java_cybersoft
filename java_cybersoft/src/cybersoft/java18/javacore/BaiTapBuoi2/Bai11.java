package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai11 {
    public static double log2(int n) {
        double ans = (Math.log(n) / Math.log(2));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int log2n = (int) log2(n);
        System.out.println(log2n);
    }
}
