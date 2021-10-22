package test3;

import java.util.Date;
import java.util.Scanner;

/* @author MeoHongNgoc*/

public class HoaDon {
    String maKhachHang;
    String tenKhachHang;
    Date ngayBatDau;

    public HoaDon(){}
    
    public HoaDon(String maKhachHang, String tenKhachHang, Date ngayBatDau) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.ngayBatDau = ngayBatDau;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
   
}
