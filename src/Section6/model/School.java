package Section6.model;

import java.util.Scanner;

public class School {
    private String id;
    private String schoolName;
    private String address;

    public School() {
    }

    public School(String id, String schoolName, String address) {
        this.id = id;
        this.schoolName = schoolName;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--Nhập thông tin trường--");
        System.out.println("Nhập ID: ");
        this.id = sc.nextLine();
        System.out.println("Nhập tên: ");
        this.schoolName = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
    }
    public  void infor(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+schoolName);
        System.out.println("Address: "+address);
    }
}
