package Section2;

import java.util.Scanner;

public class GiaiPT {
    public static double timMax(double a, double b, double c) {
        return (a > b ? (a > c ? a : c) : (b > c ? b : c));
    }

    // Hàm tìm số nhỏ nhất
    public static double timMin(double a, double b, double c) {
        return (a < b ? (a < c ? a : c) : (b < c ? b : c));
    }
    public static  void giaiPtB2(double a, double b, double c){
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô nghiệm!!");
            }else {
                System.out.println("Phương trình có 1 nghiệm: "+"x="+(-c/b));
            }
            return;
        }
        double delta= b*b - 4*a*c;
        double x1,x2;
        if(delta>0){
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phương trình có 2 nghiệm: x1= "+x1+" x2= "+x2);
        }else if (delta==0){
            System.out.println("Phương trình có 1 nghiệm suy nhất: x= "+ (-b/(2*a)));
        }else {
            System.out.println("Phương trình vô nghiệm!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        System.out.println("Max: " + timMax(a,b,c));
        System.out.println("Min: " + timMin(a,b,c));
        giaiPtB2(a,b,c);
    }
}
