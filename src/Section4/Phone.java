package Section4;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phone: ");
        String phone = sc.nextLine();
        //if (phone.matches("0\\d{9}"))
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(phone);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if (phone.charAt(0)=='0' && phone.length()==10 && numeric){
            System.out.println("Phone hợp lệ");
            String prefix = phone.substring(0,3);
//            switch (prefix){
//                case "090":
//                case "093":
//                case "089":
//                    System.out.println("Nhà mạng: Mobifone.");
//                    break;
//                case "091":
//                case "094":
//                case "088":
//                    System.out.println("Nhà mạng: Vinaphone.");
//                    break;
//                case "098":
//                case "097":
//                case "086":
//                    System.out.println("Nhà mạng: Viettel.");
//                    break;
//                default:
//                    System.out.println("Nhà mạng không xác định.");
//                    break;
            if (prefix.equals("090")|| prefix.equals("093")||prefix.equals("089")){
                System.out.println("Nhà mạng: Mobifone");
            } else if (prefix.equals("091")|| prefix.equals("094")||prefix.equals("088")) {
                System.out.println("Nhà mạng: Vinaphone");
            }else if (prefix.equals("098")|| prefix.equals("097")||prefix.equals("086")) {
                System.out.println("Nhà mạng: Viettel");
            }else {
                System.out.println("Nhà mạng không xác định");
            }
        }else {
            System.out.println("Phone không hợp lệ");
        }
    }
}
