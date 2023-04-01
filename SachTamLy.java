package src.Doan;

public class SachTamLy extends Sach {
    private double thueSachtl, thanhTien;
 
    public SachTamLy() {
        super();
    }
 
    public SachTamLy(double thueSachtl) {
        super();
        this.thueSachtl = thueSachtl;
    }
    public double getThueSachLs() {
        return thueSachtl;
    }
 
    public void setThueSachtl(double thueSachtl) {
        this.thueSachtl = thueSachtl;
    }


    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap thue sach tam ly: ");
        thueSachtl = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", thueSachtl: " + this.thueSachtl;
    }

    public double getThuesachtl() {
        return 0;
    }    
}


