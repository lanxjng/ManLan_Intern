package Section3;

import java.util.Scanner;

public class vongLap {
    public static void main(String[] args) {
//        int i =1;
//        do {
//            System.out.println(i+".helloworld");
//            i++;
//        }while (i<=10);
//------------
//        while (i<=10){
//            System.out.println(i+".helloworld");
//            i++;
//        }
// ----------
//        for (int i=1;i<=10;i++){
//            System.out.println(i+".helloworld");
//        }
//------------
//        int tong=0;
//        for(int i=1;i<=100; i++){
//            tong+=i;
//        }
//        System.out.println("Tông các số từ 1->100: "+tong);
//        -----------------
//        int giaiThua =1;
//        int n=5;
//        for (int i=1; i<=n;i++){
//            giaiThua*=i;
//        }
//        System.out.println("Giai thua cua"+ n+" là: "+giaiThua);
//        ------------
//while (true){
//        System.out.println("Hôm nay ăn zì???");
//        System.out.println("1. Cơm");
//        System.out.println("2. Phở");
//        System.out.println("3. Bún");
//        System.out.println("4. Thoát");
//        System.out.println("-------------------");
//        System.out.println("Mời bạn nhập lựa chọn!!!");
//        Scanner sc = new  Scanner(System.in);
//        String choose = sc.nextLine();
//        switch (choose){
//            case "1":
//                System.out.println("1. Cơm");
//                break;
//            case "2":
//                System.out.println("2. Phở");
//                break;
//            case "3":
//                System.out.println("3. Bún");
//                break;
//            case "4":
//                return;
//            default:
//                System.out.println("Lựa chọn không hợp lệ mời nhập lại !!!");
//        }
//        }
int choose;
do {
    System.out.println("Hôm nay ăn zì???");
    System.out.println("1. Cơm");
    System.out.println("2. Phở");
    System.out.println("3. Bún");
    System.out.println("4. Thoát");
    System.out.println("-------------------");
    System.out.println("Mời bạn nhập lựa chọn!!!");
    Scanner sc = new  Scanner(System.in);
    choose = sc.nextInt();
    switch (choose){
        case 1:
            System.out.println("1. Cơm");
            break;
        case 2:
            System.out.println("2. Phở");
            break;
        case 3:
            System.out.println("3. Bún");
            break;
        case 4:
            return;
        default:
            System.out.println("Lựa chọn không hợp lệ mời nhập lại !!!");
    }
}while (choose != 4);
    }
}
