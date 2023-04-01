package src.Doan;

public class SachLichSu extends Sach {
    private double thueSachls, thanhTien;
 
    public SachLichSu() {
        super();
    }
 
    public SachLichSu(double thueSachls) {
        super();
        this.thueSachls = thueSachls;
    }
    public double getThueSachLs() {
        return thueSachls;
    }
 
    public void setThueSachLs(double thueSachls) {
        this.thueSachls = thueSachls;
    }
    public double getThanhTien() {
        return thanhTien;
    }
 
 
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap thue sach lich su: ");
        thueSachls = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", thueSachLs: " + this.thueSachls;
    }    
}

