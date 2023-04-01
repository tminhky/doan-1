package src.Doan;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;
    private int soThutu;
    private double thanhTien;
 
    public SachGiaoKhoa() {
        super();
    }
 
    public SachGiaoKhoa(String tinhTrang, int soThutu,double thanhTien) {
        super();
        this.tinhTrang = tinhTrang;
        this.soThutu = soThutu;
        this.thanhTien = thanhTien;
    }
 
    public String getTinhTrang() {
        return tinhTrang;
    }
 
 
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
 
 
    public int getNumber() {
        return soThutu;
    }
 
 
    public void setNumber(int number) {
        this.soThutu = number;
    }
    public double getThanhTien() {
        return thanhTien;
    }
 
 
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
 
    public String tinhTrangSach(int x) {
        switch (soThutu) {
            case 0:
                tinhTrang = "old";
                break;
            case 1:
                tinhTrang = "new";
                break;
            default:
                break;
        }
        return tinhTrang;
    }
     
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap tinh trang sach (0 - old/ 1 - new): ");
        soThutu = scanner.nextInt();
    }
     
    public String toString() {
        return super.toString() + ", tinh trang sach: " + this.tinhTrangSach(soThutu);
    }
}