package src.Doan;

public class TruyenTranh extends Sach {
    private double thuetruyentranh, thanhTien;
 
    public TruyenTranh() {
        super();
    }
 
    public TruyenTranh(double thuetruyentranh) {
        super();
        this.thuetruyentranh = thuetruyentranh;
    }
    public double getThuetruyentranh() {
        return thuetruyentranh;
    }
 
    public void setThuetruyentranh(double thuetruyentranh) {
        this.thuetruyentranh = thuetruyentranh;
    }
    public double getThanhTien() {
        return thanhTien;
    }
 
 
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap thue truyen tranh: ");
        thuetruyentranh = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", thuetruyentranh: " + this.thuetruyentranh;
    }    
}
