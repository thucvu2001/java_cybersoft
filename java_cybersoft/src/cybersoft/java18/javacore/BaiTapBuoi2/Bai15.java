package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.printf("a) Do dai cua chuoi: %d\n", s.length());
        System.out.print("b) Nhap vao vi tri can in: ");
        int idx = sc.nextInt();
        System.out.printf("   Ki tu tai vi tri %d la: %c\n", idx, s.charAt(idx));
        String t = "abcdef";
        if (s.contains(t)) {
            System.out.println("c) Chuoi vua nhap co chuoi phu abcdef");
        } else {
            System.out.println("c) Chuoi vua nhap khong co chuoi phu abcdef");
        }
    }
}
