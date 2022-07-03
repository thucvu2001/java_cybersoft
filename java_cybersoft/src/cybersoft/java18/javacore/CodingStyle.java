package cybersoft.java18.javacore;

public class CodingStyle {
    /**
     * @param name
     */
    public void funcitionWithDocumentation(String name) {
        System.out.println("I'm a funciton" + name);
    }

    public static void main(String[] args) {
        System.out.println("Ngay hàng thẳng lối"); // scope: {}
        if ("Hom nay troi khong mua".length() > 5) {
            // do something
        }
        if ("Trong body cua if chi co 1 dong thi khong nen bo scope".length() == 1) {
            // do something
        }
        // inline comment: nen comment co cuoi dong
        /**
         * 	CLEAN CODE
         *
         *  Đặt tên biến có ý nghĩa!
         *  Ví dụ: int soInt; double tongGiaiThua;
         *  Chống chỉ định: int soX = 5; => x là gì?
         *
         * 	Đặt tên hàm có ý nghĩa!
         *
         * 	Nên tách hàm nếu thấy code quá dài!
         *
         * 	Pseudo Code: mã giả
         */
    }
}