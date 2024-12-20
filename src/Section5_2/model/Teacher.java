package Section5_2.model;

import java.util.Scanner;

public class Teacher {
    private String id;
    private String name;
    private String address;
    private String facility;

    public Teacher() {
    }

    public Teacher(String id, String name, String address, String facility) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.facility = facility;
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

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }
    public void inputTeacher(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        this.id = sc.nextLine();
        System.out.println("Nhập tên giảng viên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập địa chỉ giảng viên: ");
        this.address = sc.nextLine();
        System.out.println("Nhập cơ sở giảng viên: ");
        this.facility = sc.nextLine();
    }
    public void inforTeacher(){
        System.out.println("--Thông tin giảng viên--");
        System.out.println("ID: " + id);
        System.out.println("Name: "+name);
        System.out.println("Address: "+ address);
        System.out.println("Facility: "+facility);
    }
}
