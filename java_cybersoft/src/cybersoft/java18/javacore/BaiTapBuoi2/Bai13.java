package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // nhap vao so phan tu cua mang
        int[] a = new int[100]; // mang a co n phan tu
        long tong = 0;
        int min = (int) 1e9;
        int max = (int) -1e9;
        int amMin = -1;
        int amMax = (int) -1e9;
        int duongMin = (int) 1e9;
        int duongMax = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(a[i], min);
            max = Math.max(a[i], max);
            if (a[i] < 0) {
                amMin = Math.min(a[i], amMin);
                amMax = Math.max(a[i], amMax);
            }
            if (a[i] > 0) {
                duongMin = Math.min(a[i], duongMin);
                duongMax = Math.max(a[i], duongMax);
            }
            tong += a[i];
        }
        float trungBinh = (float) tong / n;
        System.out.printf("a) Gia tri trung binh: %.3f", trungBinh);
        System.out.println();
        System.out.printf("b) Phan tu lon nhat: %d;" + " Phan tu nho nhat: %d", max, min);
        System.out.println();
        System.out.printf("c) Phan tu am lon nhat: %d;" + " Phan tu am nho nhat: %d", amMax, amMin);
        System.out.println();
        System.out.printf("d) Phan tu duong lon nhat: %d;" + " Phan tu duong nho nhat: %d", duongMax, duongMin);
        System.out.println();
        System.out.print("e) Phan tu chan: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.print("; Phan tu le: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.print("f) Nhap vao vi tri can them: ");
        int idxAdd = sc.nextInt(); // vi tri can them
        System.out.print("   Nhap vao gia tri can them: ");
        int res = sc.nextInt(); // res la phan tu can them
        for (int i = n + 1; i > idxAdd; i--) {
            a[i] = a[i - 1];
        }
        n++;
        a[idxAdd] = res;
        System.out.print("   Mang sau khi them: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("g) Nhap vao vi tri can xoa: ");
        int idxDelete = sc.nextInt();
        for (int i = idxDelete; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;
        System.out.print("   Mang sau khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
