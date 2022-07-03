package cybersoft.java18.javacore.BaiTapBuoi2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TinhTienKaraoke {
    public static long TinhTien(float soGio, int soChaiNuoc) {
        if (soGio <= 3) {
            return (long) (soGio * 30000) + soChaiNuoc * 10000;
        } else {
            return  90000 + (long)((soGio - 3) * 9000);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soGio = sc.nextByte();
        int soChaiNuoc = sc.nextInt();
        System.out.println(TinhTien(soGio, soChaiNuoc));
    }
}
