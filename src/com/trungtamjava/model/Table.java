package com.trungtamjava.model;

public class Table {
    String ten;
    String kieu;
    float dongia;
    int solg;

    public Table() {
    }

    public Table(int solg, float dongia, String kieu, String ten) {
        this.solg = solg;
        this.dongia = dongia;
        this.kieu = kieu;
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public int getSolg() {
        return solg;
    }

    public void setSolg(int solg) {
        this.solg = solg;
    }
}
