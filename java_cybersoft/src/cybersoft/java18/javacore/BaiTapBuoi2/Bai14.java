package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai14 {
    /***
     * Chuong trinh xoa 1 phan tu o vi tri idx cua mang a co n phan tu
     * @param a
     * @param n
     * @param idx
     */
    public static void xoaPhanTu(int[] a, int n, int idx) {
        for (int i = idx; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    xoaPhanTu(a, n, j);
                    --n;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
