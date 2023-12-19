package model;

import java.util.Date;
import java.util.Objects;

public class ThiSinh {
    private int maThiSinh;
    private String tenSinhVien;
    private Tinh queQuan;
    private Date ngaySinh;
    private Boolean gioiTinh;
    private double diemMon1 ,diemMon2 ,diemMon3;

    public ThiSinh(int maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public ThiSinh(int maThiSinh, String tenSinhVien, Tinh queQuan, Date ngaySinh, Boolean gioiTinh, double diemMon1, double diemMon2, double diemMon3) {
        this.maThiSinh = maThiSinh;
        this.tenSinhVien = tenSinhVien;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public int getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(int maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getQueQuan() {
        return queQuan.getTenTinh();
    }

    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(double diemMon3) {
        this.diemMon3 = diemMon3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThiSinh thiSinh = (ThiSinh) o;
        return maThiSinh == thiSinh.maThiSinh && Double.compare(thiSinh.diemMon1, diemMon1) == 0 && Double.compare(thiSinh.diemMon2, diemMon2) == 0 && Double.compare(thiSinh.diemMon3, diemMon3) == 0 && Objects.equals(tenSinhVien, thiSinh.tenSinhVien) && Objects.equals(queQuan, thiSinh.queQuan) && Objects.equals(ngaySinh, thiSinh.ngaySinh) && Objects.equals(gioiTinh, thiSinh.gioiTinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maThiSinh, tenSinhVien, queQuan, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
    }
}
