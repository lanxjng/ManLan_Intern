package Section1;

import java.util.Scanner;

public class Mathh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Căn bậc 2: "+ Math.sqrt(a));
        System.out.println("Bình phương: "+ a*a);
        System.out.println("PI x a: "+ Math.PI *a);
    }
}
