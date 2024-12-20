package com.trungtamjava.main;

import com.trungtamjava.model.Chair;
import com.trungtamjava.model.Laptop;
import com.trungtamjava.model.Person;
import com.trungtamjava.model.Table;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setTen("Man Lan");
        p1.setTuoi(20);
        p1.setQuequan("Bac Ninh");
        p1.setSothich("Nghe nhạc");
        System.out.println(p1.getTen()+" được "+p1.getTuoi()+" tủi quê ở "+p1.getQuequan()+" thích "+p1.getSothich());

        Person p2 = new Person("Man Lan2", 20, "Bac Ninh", "Nghe nhạc");
        System.out.println(p2.getTen()+" được "+p2.getTuoi()+" tủi quê ở "+p2.getQuequan()+" thích "+p2.getSothich());

        //------------------
        Chair chair1 = new Chair();
        chair1.setTen("Ghế đơn");
        chair1.setLoai("Sofa");
        chair1.setMota("thoải mái");
        chair1.setGia(200);
        System.out.println(chair1.getTen()+"-"+chair1.getLoai()+"-"+chair1.getMota()+"-"+chair1.getGia());

        Chair chair2 = new Chair("Ghế đôi","Gỗ","Đau lưng",300);
        System.out.println(chair2.getTen()+"-"+chair2.getLoai()+"-"+chair2.getMota()+"-"+chair2.getGia());

        //-------------------------
        Table tb1 = new Table();
        tb1.setTen("Bàn học");
        tb1.setKieu("4 chân");
        tb1.setDongia(200);
        tb1.setSolg(3);
        System.out.println(tb1.getTen()+"-"+tb1.getKieu()+"-"+tb1.getDongia()+"-"+tb1.getSolg());

        Table tb2 = new Table(3,500," Bàn+Tủ ","Bàn kèm tủ " );
        System.out.println(tb2.getTen()+"-"+tb2.getKieu()+"-"+tb2.getDongia()+"-"+tb2.getSolg());

        //--------------
        Laptop lt1 = new Laptop();
        lt1.setTen("Lap1");
        lt1.setGia(300000);
        lt1.setSolg(2);
        lt1.setHang("DELL");
        System.out.println(lt1.getTen()+"-"+lt1.getHang()+"-"+lt1.getGia()+"-"+lt1.getSolg());

        Laptop lt2 = new Laptop("Lap2","LEGION",400000,5);
        System.out.println(lt2.getTen()+"-"+lt2.getHang()+"-"+lt2.getGia()+"-"+lt2.getSolg());
    }
}
