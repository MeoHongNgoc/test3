package test3;

import java.util.Date;

/* @author MeoHongNgoc*/

public class OGhep extends KhachHang{
    private float tienthue;
    private int soNguoi;
    private float tienDien;
    private float tienNuoc;

    public OGhep(){}

    public OGhep(float tienthue, int soNguoi, float tienDien, float tienNuoc, 
            String soCMND, int soThangThue, String maKhachHang,
            String tenKhachHang, Date ngayBatDau, boolean gioiTinh) {
        super(soCMND, soThangThue, tienDien, tienNuoc, maKhachHang, tenKhachHang, ngayBatDau, gioiTinh);
        this.tienthue = tienthue;
        this.soNguoi = soNguoi;
        this.tienDien = tienDien;
        this.tienNuoc = tienNuoc;
    }

    public float getTienthue() {
        return tienthue/soNguoi;
    }

    public void setTienthue(float tienthue) {
        this.tienthue = tienthue;
    }

    public int getSoNguoi() {
        if(soNguoi<= 1 ||soNguoi > 3){
            return 0;
        }else{
            return soNguoi;
        }
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public float getTienDien() {
        return tienDien = 500/soNguoi;
    }

    public void setTienDien(float tienDien) {
        this.tienDien = tienDien;
    }

    public float getTienNuoc() {
        return tienNuoc = 200/soNguoi;
    }

    public void setTienNuoc(float tienNuoc) {
        this.tienNuoc = tienNuoc;
    }

    public float tien(){
        float t = (getTienDien() + getTienthue() +getTienNuoc() + 100) * soThangThue;
        return   t;
    }
    @Override
    public String toString() {
        String str = "Tiền Thuê trọ của khách hàng :\n"
                + "Thuê : Ghép \n" 
                + "Họ và Tên : "+tenKhachHang+"\n"
                +"Số Người ở Ghép : "+soNguoi+"\n"
                + "Ngày Bắt Đầu Thuê : "+getNgayBatDau()+"\n"
                + "Thời Hạn Thuê : "+ soThangThue +" tháng \n"
                + "Tiền Dịch Vụ dành cho mỗi người : \n"
                + "Tiền Thuê + Tiền Điện + Tiền Nước + 100K(Tiền Vệ Sinh) : \n"
                +tien()+ "Nghìn Đồng";
        return str ;
    }
}
