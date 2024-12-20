package Section4;

import java.util.Scanner;

public class Mail {
    //if (email.matches("^[a-zA-Z0-9]{6,}@[a-zA-Z]+\\.gmail\\.com$"))
    public static boolean Validate(String email) {
        // Kiểm tra nếu email chứa ký tự '@' và kết thúc bằng ".gmail.com"
        if (email == null || !email.contains("@") || !email.endsWith(".gmail.com")) {
            System.out.println("email phải chứa '@' và kết thúc bằng '.gmail.com'");
            return false;
        }
        // Tách phần tên email trước dấu '@'
        String username = email.split("@")[0];
        // Kiểm tra điều kiện: tên email phải chứa ít nhất một chữ cái và một chữ số
        if (username.length() < 6) {
            System.out.println("usernam phải >6 ký tự");
            return false;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;

        // Kiểm tra nếu tên email chứa ít nhất một chữ cái và một chữ số
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (Character.isLetter(c)) {
                hasLetter = true;
            }else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        return hasLetter && hasDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào email: ");
        String mail = sc.nextLine();
        if (Validate(mail)){
            System.out.println("Email hợp lệ");
        }else{
            System.out.println("Email không hợp lệ");
        }
    }
}
