package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - GIAI PHUONG TRINH BAC 1: ax + b = 0");
        System.out.println("2 - GIAI PHUONG TRINH BAC 2: ax^2 + bx + c = 0");
        System.out.print("Nhap lua chon (1 hoac 2): ");
        int choose = sc.nextInt();
        if (choose == 1) { // giai phuong trinh bac 1
            System.out.print("Nhap vap he so a: ");
            int a = sc.nextInt();
            System.out.print("Nhap vao he so b: ");
            int b = sc.nextInt();
            if (a == 0) {
                if (b == 0) {
                    System.out.printf("Phuong trinh %dx + %d = 0 co vo so nghiem", a, b);
                } else {
                    System.out.printf("Phuong trinh %dx + %d = 0 vo nghiem", a, b);
                }
            } else {
                System.out.printf("Phuong trinh %dx + %d = 0 co nghiem la: %.f", a, b, (float) -b / a);
            }
        } else if (choose == 2) {
            System.out.print("Nhap vao he so a: ");
            int a = sc.nextInt();
            System.out.print("Nhap vao he so b: ");
            int b = sc.nextInt();
            System.out.print("Nhap vao he so c: ");
            int c = sc.nextInt();
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.printf("Phuong trinh %dx^2 + %dx + %d = 0 co vo so nghiem", a, b, c);
                    } else {
                        System.out.printf("Phuong trinh %dx^2 + %dx + %d = 0 vo nghiem", a, b, c);
                    }
                } else {
                    System.out.printf("Phuong trinh %dx^2 + %dx + %d = 0 co nghiem duy nhat: %f", a, b, c, (float) -c / b);
                }
            } else {
                float delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.printf("Phuong trinh %dx^2 + %dx + %d = 0 vo nghiem", a, b, c);
                } else if (delta == 0) {
                    System.out.printf("Phuong trinh %dx^2 + %dx + %d = 0 co nghiem kep la: %f", a, b, c, (float) -b / 2 * a);
                } else {
                    System.out.printf("Phuong trinh %dx^2 + %dx + %d = 0 co 2 nghiem phan biet la: %f va %f", a, b, c, (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a));
                }
            }
        }
    }
}
