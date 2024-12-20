package com.trungtamjava.model;

public class Chair {
    //bien instance(toàn cục)
    String ten;
    String loai;
    String mota;
    int gia;

    //constructor(hàm tạo: mặc định/tùy biến)

    public Chair() {
    }

    public Chair(String ten, String loai, String mota, int gia) {
        this.ten = ten;
        this.loai = loai;
        this.mota = mota;
        this.gia = gia;
    }
    //set-get


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
