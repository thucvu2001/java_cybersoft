package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long soTienGui = sc.nextLong();
        long soTienCan = sc.nextLong();
        long soTienLai = sc.nextLong();
        System.out.printf("Thoi gian can de co du so tien: %d\n", (soTienCan - soTienGui) / soTienLai);
    }
}
