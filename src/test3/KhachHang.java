package test3;

import java.util.Date;

/* @author MeoHongNgoc*/

public class KhachHang extends HoaDon{
    private String soCMND;
    int soThangThue;
    private boolean gioiTinh;

    public KhachHang(){}
    
    public KhachHang(String soCMND, int soThangThue, float tienDien, float tienNuoc, 
            String maKhachHang, String tenKhachHang, Date ngayBatDau, boolean gioiTinh) {
        super(maKhachHang, tenKhachHang, ngayBatDau);
        this.soCMND = soCMND;
        this.soThangThue = soThangThue;
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public int getSoThangThue() {
        if(soThangThue < 0){
            return 0;
        }else {
            return soThangThue;
        }
    }

    public void setSoThangThue(int soThangThue) {
        this.soThangThue = soThangThue;
    }


    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    
}
