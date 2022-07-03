package cybersoft.java18.javacore.BaiTapBuoi2;

public class Bai1 {
    public static void main(String[] args) {
        for (int k = 1; k <= 9; k++) {
            for (int i = 1; i <= 11; i++) {
                if (k % 2 == 1) {
                    if (i % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (i % 2 == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.print(" ");
            for (int i = 1; i <= 34; i++) {
                System.out.print("=");
            }
            System.out.println();
        }
        for (int k = 1; k <= 6; k++) {
            for (int i = 1; i <= 46; i++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
