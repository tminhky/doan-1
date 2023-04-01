package src.Doan;

public class SachKhoaHoc extends Sach {
    private double thueSachKh, thanhTien;
 
    public SachKhoaHoc() {
        super();
    }
 
    public SachKhoaHoc(double thueSachKh) {
        super();
        this.thueSachKh = thueSachKh;
    }
 
    public double getThueSachKh() {
        return thueSachKh;
    }
 
    public void setThueSachKh(double thueSachKh) {
        this.thueSachKh = thueSachKh;
    }

    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap thue sach khoa hoc: ");
        thueSachKh = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", thueSachKh: " + this.thueSachKh;
    }
     
}
    
