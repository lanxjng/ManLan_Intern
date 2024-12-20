package Section2;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tuổi cần phân loại: ");
        int age = sc.nextInt();
        if (age<1){
            System.out.println("Trẻ sơ sinh");
        } else if (age>=1 && age <=3) {
            System.out.println("Em bé");
        } else if (age>3 && age <=18) {
            System.out.println("Trẻ em");
        } else if (age>18 && age<=40) {
            System.out.println("Người lớn");
        } else if (age>40 && age<60) {
            System.out.println("Trung niên");
        }else if (age>=60){
            System.out.println("Người già");
        }
    }
}
