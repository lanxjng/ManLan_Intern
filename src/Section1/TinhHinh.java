package Section1;

import java.util.Scanner;

public class TinhHinh {
    class HinhVuong{
        public static double chuVi(double a){
            return 4*a;
        }
        public static double dienTich(double a){
            return a*a;
        }
    }
    class HinhChuNhat{
        public static double chuVi(double a, double b){
            return (a+b)*2;
        }
        public static double dienTich(double a, double b){
            return a*b;
        }
    }
    class HinhTron{
        public static double chuVi(double bk){
            return (2*bk)*Math.PI;
        }
        public static double dienTich(double bk){
            return (bk*bk)*Math.PI;
        }
    }
    class HinhTamGiacVuong{
        public static double chuVi(double a, double b){
            double c= Math.sqrt(a*a + b*b);
            return a+b+c;
        }
        public static double dienTich(double a, double b){
            return (a*b)/2;
        }
    }

    public static void main(String[] args) {
//        System.out.println("Chu vi hình vuông: "+HinhVuong.chuVi(5)+" - Diện tích hình vuông:"+HinhVuong.dienTich(5) );
//        System.out.println("Chu vi hình chữ nhật: "+HinhChuNhat.chuVi(5,7)+" - Diện tích hình chữ nhật:"+HinhChuNhat.dienTich(5,7) );
//        System.out.println("Chu vi hình tròn: "+HinhTron.chuVi(5)+" - Diện tích hình tròn:"+HinhTron.dienTich(5) );
//        System.out.println("Chu vi hình tam giác vuông: "+HinhTamGiacVuong.chuVi(3,4)+" - Diện tích tam giác vuông:"+HinhTamGiacVuong.dienTich(3,4) );
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh vuông: ");
        double canh = sc.nextDouble();
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = sc.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = sc.nextDouble();
        System.out.println("Nhập bán kính hình tròn: ");
        double bk = sc.nextDouble();
        System.out.println("Nhập độ dài cạnh a tam giác: ");
        double canha = sc.nextDouble();
        System.out.println("Nhập độ dài cạnh b tam giác: ");
        double canhb = sc.nextDouble();
        System.out.println("Chu vi hình vuông: "+HinhVuong.chuVi(canh)+" - Diện tích hình vuông:"+HinhVuong.dienTich(canh) );
        System.out.println("Chu vi hình chữ nhật: "+HinhChuNhat.chuVi(chieuDai,chieuRong)+" - Diện tích hình chữ nhật:"+HinhChuNhat.dienTich(chieuDai,chieuRong) );
        System.out.println("Chu vi hình tròn: "+HinhTron.chuVi(bk)+" - Diện tích hình tròn:"+HinhTron.dienTich(bk) );
        System.out.println("Chu vi hình tam giác vuông: "+HinhTamGiacVuong.chuVi(canha,canhb)+" - Diện tích tam giác vuông:"+HinhTamGiacVuong.dienTich(canha,canhb) );
    }
}
