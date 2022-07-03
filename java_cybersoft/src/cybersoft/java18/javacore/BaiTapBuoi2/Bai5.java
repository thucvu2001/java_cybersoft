package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap vao cac toa do A(x1, y1) B(x2, y2)
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double doDai = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // cong thuc tinh do dai
        System.out.printf("do dai doan thang AB: %.3f", doDai);
    }
}
