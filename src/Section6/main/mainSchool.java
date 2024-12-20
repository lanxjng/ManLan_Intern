package Section6.main;

import Section6.model.School;

import java.util.Scanner;

public class mainSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng trường học: ");
        int n = Integer.parseInt(sc.nextLine());
        School[] schools = new School[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập trường thứ: " + (i + 1));
            schools[i] = new School();
            schools[i].input();
        }

        System.out.println("Danh sách các trường học ");
        for (int i = 0; i < n; i++) {
            System.out.println("------------------");
            System.out.println("Thông tin trường thứ: " + (i + 1));
            schools[i].infor();
        }

        System.out.println("Nhập vào trường cần tìm kiếm");
        String search = sc.nextLine();
        System.out.println("Kết quả tìm kiếm");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (schools[i].getSchoolName().toLowerCase().contains(search.toLowerCase())) {
                schools[i].infor();
                found = true;
            }
        }
        if (!found){
            System.out.println("Không tồn tại truờng này!!!");
        }
    }
}
