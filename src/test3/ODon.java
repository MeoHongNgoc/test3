package test3;

import java.util.Date;

/* @author MeoHongNgoc*/

public class ODon extends KhachHang{
    private float tienThue;
    private float tienDien;
    private float tienNuoc;

    public ODon(){}

    public ODon(float tienThue, float tienDien, float tienNuoc, String soCMND, 
            int soThangThue, String maKhachHang, 
            String tenKhachHang, Date ngayBatDau, boolean gioiTinh) {
        super(soCMND, soThangThue, tienDien, tienNuoc, maKhachHang, tenKhachHang, ngayBatDau, gioiTinh);
        this.tienThue = tienThue;
        this.tienDien = tienDien;
        this.tienNuoc = tienNuoc;
    }

    public float getTienThue() {
        return tienThue;
    }

    public void setTienThue(float tienThue) {
        this.tienThue = tienThue;
    }

    public float getTienDien() {
        return tienDien = 500;
    }

    public void setTienDien(float tienDien) {
        this.tienDien = tienDien;
    }

    public float getTienNuoc() {
        return tienNuoc = 200;
    }

    public void setTienNuoc(float tienNuoc) {
        this.tienNuoc = tienNuoc;
    }

    public float tien(){
        float t =  (getTienDien()+getTienNuoc()+getTienThue()+ 100)*soThangThue;
        return t;
    }

    @Override
    public String toString() {
        String str = "Tiền Thuê trọ của khách hàng :\n"
                + "Thuê : Đơn \n"
                + "Họ và Tên : "+tenKhachHang+"\n"
                + "Ngày Bắt Đầu Thuê : "+getNgayBatDau()+"\n"
                + "Thời Hạn Thuê : "+ soThangThue +" tháng \n"
                + "Tiền Dịch Vụ : \n"
                + "Tiền Thuê "
                + "+ Tiền Điện + Tiền Nước + 100K(Tiền Vệ Sinh) : \n"
                +tien()+"Nghìn Đồng";
        return str ;
    }

}
