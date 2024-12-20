package Section2;

import java.util.Scanner;

public class Choose {
    public static void main(String[] args) {
        System.out.println("Hôm nay ăn zì???");
        System.out.println("A. Cơm");
        System.out.println("B. Phở");
        System.out.println("C. Bún");
        System.out.println("D. Cháo");
        System.out.println("-------------------");
        System.out.println("Mời bạn nhập lựa chọn!!!");
        Scanner sc = new  Scanner(System.in);
        String choose = sc.nextLine();
        switch (choose){
            case "A":
                System.out.println("A. Cơm");
                break;
            case "B":
                System.out.println("B. Phở");
                break;
            case "C":
                System.out.println("C. Bún");
                break;
            case "D":
                System.out.println("D. Cháo");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ mời nhập lại !!!");
        }

    }
}
