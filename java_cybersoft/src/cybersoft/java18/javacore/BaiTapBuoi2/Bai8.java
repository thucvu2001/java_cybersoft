package cybersoft.java18.javacore.BaiTapBuoi2;

import java.util.Scanner;

public class Bai8 {
    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String before = sc.nextLine(); // chuoi ban dau (chuoi in thuong)
        String[] words = before.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.print(chuanHoa(words[i] + " "));
        }
    }
}
