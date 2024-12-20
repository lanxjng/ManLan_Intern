package Section1;

public class TinhToan {

    public static int Tong(int a, int b){
        return a+b;
    }
    public static int Hieu(int a, int b){
        return a-b;
    }
    public static int Tich(int a, int b){
        return a*b;
    }
    public static int Thuong(int a, int b){
        return a/b;
    }
//    -------------------------
    public static double Tong(double a, double b){
        return a+b;
    }
    public static double Hieu(double a, double b){
        return a-b;
    }
    public static double Tich(double a, double b){
        return a*b;
    }
    public static double Thuong(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        int a=7;
        int b=5;
        double c = 7.5;
        double d = 3.3;
        System.out.println("Tổng int 2 số: "+Tong(a,b));
        System.out.println("Hiệu int 2 số: "+Hieu(a,b));
        System.out.println("Tích int 2 số: "+Tich(a,b));
        System.out.println("Thương int 2 số: "+Thuong(a,b));
        System.out.println("----------------");
        System.out.println("Tổng double 2 số: "+Tong(c,d));
        System.out.println("Hiệu double 2 số: "+Hieu(c,d));
        System.out.println("Tích double 2 số: "+Tich(c,d));
        System.out.println("Thương double 2 số: "+Thuong(c,d));

    }
}
