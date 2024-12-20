package Section4;

import java.util.Scanner;

public class stringgg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một string: ");
        String string1 = sc.nextLine();
        System.out.println("Độ dài string1: "+ string1.length());
        System.out.println("Nhập string khác: ");
        String string = sc.nextLine();
        if (string1.contains(string)){
            System.out.println("string nằm trong string1");
        }else {
            System.out.println("string không nằm trong string1");
        }
        int count=0;
        for (int i=0; i<string1.length();i++){
            if (string1.charAt(i) =='A'){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện ký tự A trong string1 là: " +count);

        String[] cut = string1.split("\s+");
        System.out.println("Các chuỗi sau khi cắt:");
        for (String a : cut) {
            System.out.println(a);
        }
    }
}
