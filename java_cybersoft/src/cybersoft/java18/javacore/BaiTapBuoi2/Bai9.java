package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so1 = sc.nextInt();
        int so2 = sc.nextInt();
        Set<Integer> se = new HashSet<>();
        while (so1 != 0) {
            se.add(so1 % 10);
            so1 /= 10;
        }
        while (so2 != 0) {
            se.add(so2 % 10);
            so2 /= 10;
        }
        if (se.size() == 4) {
            System.out.println("FALSE");
        } else {
            System.out.println("TRUE");
        }
    }
}
