package com.trungtamjava.model;

public class Person {
    String ten;
    int tuoi;
    String quequan;
    String sothich;

    public Person(){

    }
    public Person(String ten,int tuoi, String quequan, String sothich){
        this.ten = ten;
        this.tuoi = tuoi;
        this.quequan = quequan;
        this.sothich = sothich;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getSothich() {
        return sothich;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }
}
