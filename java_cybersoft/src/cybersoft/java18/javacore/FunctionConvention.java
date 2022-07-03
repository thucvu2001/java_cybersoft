package cybersoft.java18.javacore;

import java.util.Scanner;

public class FunctionConvention {
    /**
     *  <access modifier> return-type tenFunction (parameterType params,...)
     *      function body
     *      return
     *  }
     */

    /**
     * Chuong trinh in ra cau choa mung trong man hinh console
     *
     * @param name
     * @param welcomeName
     */
    public static void sayHello(String name, String welcomeName) {
        System.out.printf("Welcome %s %s to Java course. \n", welcomeName, name);
    }

    public static boolean checkSoChan(int soN) {
        return (soN % 2 == 0);
    }

    /**
     * Ham kiem tra so nguyen to
     *
     * @param soN
     * @return <true> neu soN la so nguyen to, <false> neu soN khong phai la so nguyen to
     */
    public static boolean checkSoNguyenTo(int soN) {
        for (int i = 2; i <= Math.sqrt(soN); i++) {
            if (soN % i == 0) {
                return false;
            }
        }
        return soN > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sayHello("Thuc", "Mr");
        System.out.print("Nhập vào một số nguyên: ");
        int soN = sc.nextInt();
        if (checkSoChan(soN)) {
            System.out.printf("\n%d la so chan.\n", soN);
        } else {
            System.out.printf("\n%d la so le.\n", soN);
        }
        if (checkSoNguyenTo(soN)) {
            System.out.printf("%d la so nguyen to.\n", soN);
        } else {
            System.out.println("%d khong la so nguyen to.\n");
        }
    }
}

