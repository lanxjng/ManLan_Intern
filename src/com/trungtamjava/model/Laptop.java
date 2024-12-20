package com.trungtamjava.model;

public class Laptop {
    String ten;
    String hang;
    float gia;
    int solg;

    public Laptop() {
    }

    public Laptop(String ten, String hang, float gia, int solg) {
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.solg = solg;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSolg() {
        return solg;
    }

    public void setSolg(int solg) {
        this.solg = solg;
    }
}
