package src.Doan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();//
        ArrayList<SachKhoaHoc> arrSachKhoaHoc = new ArrayList<>();//
        ArrayList<SachLichSu> arrSachLichSu = new ArrayList<>();//    ham khoi tao mang
        ArrayList<SachTamLy> arrSachTamLy = new ArrayList<>();//
        ArrayList<TruyenTranh> arrTruyenTranh = new ArrayList<>();//
        int soSachGiaoKhoa, soSachKhoaHoc, soSachLichSu, soSachTamLy, soTruyenTranh;
        double tongTienSachGiaoKhoa = 0, tongTienSachKhoaHoc = 0,tongTienSachLichSu = 0,tongTienSachTamLy = 0,tongTienTruyenTranh = 0, tongDonGiaSachTamLy = 0, tongDonGiaTruyenTranh = 0, tongDonGiaSachKhoaHoc = 0, 
        tongDonGiaSachLichSu = 0,tongDonGiaSachGiaoKhoa = 0, trungBinhCongDonGiaSachKH = 0, trungBinhCongDonGiaSachLS = 0, trungBinhCongDonGiaSachGK = 0, trungBinhCongDonGiaSachTL = 0, trungBinhCongDonGiaTT = 0;
       
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhap so sach  giao khoa: ");
        soSachGiaoKhoa = scanner.nextInt();
        System.out.print("Nhap so sach khoa hoc: ");
        soSachKhoaHoc = scanner.nextInt();
        System.out.print("Nhap so sach lich su: ");
        soSachLichSu = scanner.nextInt();
        System.out.print("Nhap so sach tam ly: ");
        soSachTamLy = scanner.nextInt();
        System.out.println("Nhap so truyen tranh: ");
        soTruyenTranh = scanner.nextInt();

// --------------------0-----------------nhap thong tin cua cac loai sach
        //--1
        System.out.println("Nhap thong tin sach giao khoa:");
        for (int i = 0; i < soSachGiaoKhoa; i++) {
            System.out.println("Nhap thong tin quyen sach thu  " + (i + 1) + ":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            arrSachGiaoKhoa.add(sachGiaoKhoa);
        }
        //--2
        System.out.println("Nhap thong tin sach khoa hoc:");
        for (int i = 0; i < soSachKhoaHoc; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            SachKhoaHoc sachKH = new SachKhoaHoc();
            sachKH.nhapSach();
            arrSachKhoaHoc.add(sachKH);
        }
        //--3
        System.out.println("Nhap thong tin sach lich su:");
        for (int i = 0; i < soSachLichSu; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            SachLichSu sachLS = new SachLichSu();
            sachLS.nhapSach();
            arrSachLichSu.add(sachLS);
        }
        //--4
        System.out.println("Nhap thong tin sach tam ly:");
        for (int i = 0; i < soSachTamLy; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            SachTamLy sachTL = new SachTamLy();
            sachTL.nhapSach();
            arrSachTamLy.add(sachTL);
        }
        //--5
        System.out.println("Nhap thong tin truyen tranh:");
        for (int i = 0; i < soTruyenTranh; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            TruyenTranh truyentranh = new TruyenTranh();
            truyentranh.nhapSach();
            arrTruyenTranh.add(truyentranh);
        }
         
// --------------------0-----------------tong tien cua cac loai sach
        //--1
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            if (arrSachGiaoKhoa.get(i).getNumber() == 0) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                    arrSachGiaoKhoa.get(i).getDonGia() * 50 / 100;
            } else if (arrSachGiaoKhoa.get(i).getNumber() == 1) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                    arrSachGiaoKhoa.get(i).getDonGia();
            }
        }
        System.out.println("Tong tien sach giao khoa = " + tongTienSachGiaoKhoa);  
        //--2
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            tongTienSachKhoaHoc += arrSachKhoaHoc.get(i).getSoLuong() * 
                arrSachKhoaHoc.get(i).getDonGia() + arrSachKhoaHoc.get(i).getThueSachKh();
        }
        System.out.println("Tong tien sach khoa hoc = " + tongTienSachKhoaHoc); 
        //--3
        for (int i = 0; i < arrSachLichSu.size(); i++) {
            tongTienSachLichSu += arrSachLichSu.get(i).getSoLuong() * 
                arrSachLichSu.get(i).getDonGia() + arrSachLichSu.get(i).getThueSachLs();
        }
        System.out.println("Tong tien sach lich su = " + tongTienSachLichSu);
        //--4
        for (int i = 0; i < arrSachTamLy.size(); i++) {
            tongTienSachTamLy += arrSachTamLy.get(i).getSoLuong() * 
                arrSachTamLy.get(i).getDonGia() + arrSachTamLy.get(i).getThuesachtl();
        }
        System.out.println("Tong tien sach tam ly = " + tongTienSachTamLy);
        //--5
        for (int i = 0; i < arrTruyenTranh.size(); i++) {
            tongTienTruyenTranh += arrTruyenTranh.get(i).getSoLuong() * 
                arrTruyenTranh.get(i).getDonGia() + arrTruyenTranh.get(i).getThuetruyentranh();
        }
        System.out.println("Tong tien truyen tranh = " + tongTienTruyenTranh);

// --------------------0-----------------thon tin cua cac loai sach        
        //--1
        System.out.println("-----Thong tin sach giao khoa-----");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            System.out.println(arrSachGiaoKhoa.get(i).toString());
        }
        //--2
        System.out.println("-----Thong tin sach khoa hoc-----");
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            System.out.println(arrSachKhoaHoc.get(i).toString());
        }
        //--3
        System.out.println("-----Thong tin sach lich su-----");
        for (int i = 0; i < arrSachLichSu.size(); i++) {
            System.out.println(arrSachLichSu.get(i).toString());
        }
        //--4
        System.out.println("-----Thong tin sach tam ly-----");
        for (int i = 0; i < arrSachTamLy.size(); i++) {
            System.out.println(arrSachTamLy.get(i).toString());
        }
        //--5
        System.out.println("-----Thong tin truyen tranh-----");
        for (int i = 0; i < arrTruyenTranh.size(); i++) {
            System.out.println(arrTruyenTranh.get(i).toString());
        }

// --------------------0-----------------Trung binh cong don gia cac loai sach

        //--1
        System.out.println("---Trung binh cong đon gia cac sach khoa hoc---");
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            tongDonGiaSachKhoaHoc += arrSachKhoaHoc.get(i).getDonGia();
            trungBinhCongDonGiaSachKH = tongDonGiaSachKhoaHoc / arrSachKhoaHoc.size();
        }
        System.out.println("Trung binh cong don gia cac sach khoa hoc = " + trungBinhCongDonGiaSachKH);  
        //---2
        System.out.println("---Trung binh cong đon gia cac sach lich su---");
        for (int i = 0; i < arrSachLichSu.size(); i++) {
            tongDonGiaSachLichSu += arrSachLichSu.get(i).getDonGia();
            trungBinhCongDonGiaSachLS = tongDonGiaSachLichSu / arrSachLichSu.size();
        }
        System.out.println("Trung binh cong don gia cac sach lich su = " + trungBinhCongDonGiaSachLS);
        //---3
        System.out.println("---Trung binh cong đon gia cac sach giao khoa---");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            tongDonGiaSachGiaoKhoa += arrSachGiaoKhoa.get(i).getDonGia();
            trungBinhCongDonGiaSachGK = tongDonGiaSachGiaoKhoa / arrSachGiaoKhoa.size();
        }
        System.out.println("Trung binh cong don gia cac sach giao khoa = " + trungBinhCongDonGiaSachGK);
        //--4
        System.out.println("---Trung binh cong đon gia cac sach tam ly---");
        for (int i = 0; i < arrSachTamLy.size(); i++) {
            tongDonGiaSachTamLy += arrSachTamLy.get(i).getDonGia();
            trungBinhCongDonGiaSachTL = tongDonGiaSachTamLy / arrSachTamLy.size();
        }
        System.out.println("Trung binh cong don gia cac sach tam ly= " + trungBinhCongDonGiaSachTL);
        //--5
        System.out.println("---Trung binh cong đon gia cac truyen tranh---");
        for (int i = 0; i < arrTruyenTranh.size(); i++) {
            tongDonGiaTruyenTranh += arrTruyenTranh.get(i).getDonGia();
            trungBinhCongDonGiaTT = tongDonGiaTruyenTranh / arrTruyenTranh.size();
        }
        System.out.println("Trung binh cong don gia cac truyen tranh= " + trungBinhCongDonGiaTT);

// --------------------0-----------------Thong itn nha xuat ban cua cac loai sach
        //--1
        System.out.println("---Cac sach giao khoa cua nha xuat ban X---");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            if (arrSachGiaoKhoa.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(arrSachGiaoKhoa.get(i).toString());
            }
        }
        //--2
        System.out.println("---Cac sach khoa hoc cua nha xuat ban X---");
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            if (arrSachKhoaHoc.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(arrSachKhoaHoc.get(i).toString());
            }
        }
        //--3
        System.out.println("---Cac sach lich su cua nha xuat ban X---");
        for (int i = 0; i < arrSachLichSu.size(); i++) {
            if (arrSachLichSu.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(arrSachLichSu.get(i).toString());
            }
        }
        //--4
        System.out.println("---Cac sach tam ly cua nha xuat ban X---");
        for (int i = 0; i < arrSachTamLy.size(); i++) {
            if (arrSachTamLy.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(arrSachTamLy.get(i).toString());
            }
        }
        //--5
        System.out.println("---Cac truyen tranh cua nha xuat ban X---");
        for (int i = 0; i < arrTruyenTranh.size(); i++) {
            if (arrTruyenTranh.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(arrTruyenTranh.get(i).toString());
            }
        }


    }
}
