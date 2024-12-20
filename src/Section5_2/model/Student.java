package Section5_2.model;

import java.io.InputStream;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String address;
    private String major;

    public Student() {
    }

    public Student(String id, String name, String address, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        this.id = sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập địa chỉ sinh viên: ");
        this.address = sc.nextLine();
        System.out.println("Nhập chuyên ngành sinh viên: ");
        this.major = sc.nextLine();
    }
    public void inforStudent(){
        System.out.println("--Thông tin sinh viên--");
        System.out.println("ID: " + id);
        System.out.println("Name: "+name);
        System.out.println("Address: "+ address);
        System.out.println("Major: "+major);
    }
}
