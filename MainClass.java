package ASM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        Scanner scanner = new Scanner(System.in);

        int luaChon;
        
        do {
            System.out.println("----- QUAN LY NHAN VIEN -----");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Tim va hien thi nhan vien theo ma");
            System.out.println("4. Xoa nhan vien theo ma");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma");
            System.out.println("6. Tim cac nhan vien theo khoang luong");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (luaChon) {
                case 1:
                    quanLyNhanVien.nhapDanhSachNhanVien();
                    break;
                case 2:
                    quanLyNhanVien.xuatDanhSachNhanVien();
                    break;
                case 3:
                    quanLyNhanVien.timNhanVienTheoMa();
                    break;
                case 4:
                    quanLyNhanVien.xoaNhanVienTheoMa();
                    break;
                case 5:
                    quanLyNhanVien.capNhatThongTinNhanVien();
                    break;
                case 6:
                    quanLyNhanVien.timNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    quanLyNhanVien.sapXepTheoHoTen();
                    break;
                case 8:
                    quanLyNhanVien.sapXepTheoThuNhap();
                    break;
                case 9:
                    quanLyNhanVien.xuat5NhanVienCoThuNhapCaoNhat();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
            System.out.println();
        } while (luaChon != 0);
    }
}


