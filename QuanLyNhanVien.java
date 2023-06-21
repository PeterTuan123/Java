
package ASM;

import ASM.NhanVien;
import ASM.TiepThi;
import ASM.TruongPhong;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien;
    private Scanner scanner;

    public QuanLyNhanVien() {
        danhSachNhanVien = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void nhapDanhSachNhanVien() {
        System.out.print("So luong nhan vien: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            System.out.print("Ma nhan vien: ");
            String maNhanVien = scanner.nextLine();
            System.out.print("Ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Luong: ");
            double luong = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng new line

            // Lựa chọn loại nhân viên để thêm vào danh sách
            System.out.print("Loai nhan vien (1 - Nhan vien hanh chinh, 2 - Tiep thi, 3 - Truong phong): ");
            int loaiNhanVien = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (loaiNhanVien) {
                case 1:
                    NhanVien nhanVien = new NhanVien(maNhanVien, hoTen, luong);
                    danhSachNhanVien.add(nhanVien);
                    break;
                case 2:
                    System.out.print("Doanh so: ");
                    double doanhSo = scanner.nextDouble();
                    scanner.nextLine(); // Đọc bỏ dòng new line
                    NhanVien tiepThi = new TiepThi(maNhanVien, hoTen, luong, doanhSo);
                    danhSachNhanVien.add(tiepThi);
                    break;
                case 3:
                    System.out.print("So nhan vien quan ly: ");
                    int soNhanVien = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng new line
                    NhanVien truongPhong = new TruongPhong(maNhanVien, hoTen, luong, soNhanVien);
                    danhSachNhanVien.add(truongPhong);
                    break;
                default:
                    System.out.println("Loai nhan vien khong hop le.");
                    break;
            }
        }
    }

    public void xuatDanhSachNhanVien() {
        System.out.println("Danh sach nhan vien:");
        for (NhanVien nhanVien : danhSachNhanVien) {
            nhanVien.inThongTin();
            System.out.println();
        }
    }

    public void timNhanVienTheoMa() {
        System.out.print("Nhap ma nhan vien can tim: ");
        String maNhanVien = scanner.nextLine();
        boolean timThay = false;

        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getMaNhanVien().equals(maNhanVien)) {
                nhanVien.inThongTin();
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay nhan vien voi ma " + maNhanVien);
        }
    }

    public void xoaNhanVienTheoMa() {
        System.out.print("Nhap ma nhan vien can xoa: ");
        String maNhanVien = scanner.nextLine();
        boolean xoaThanhCong = false;

        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getMaNhanVien().equals(maNhanVien)) {
                danhSachNhanVien.remove(nhanVien);
                xoaThanhCong = true;
                break;
            }
        }

        if (xoaThanhCong) {
            System.out.println("Đa xoa nhan vien co ma " + maNhanVien);
        } else {
            System.out.println("Khong tim thay nhan vien voi ma " + maNhanVien);
        }
    }

    public void capNhatThongTinNhanVien() {
        System.out.print("Nhap ma nhan vien can cap nhat: ");
        String maNhanVien = scanner.nextLine();
        boolean capNhatThanhCong = false;

        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getMaNhanVien().equals(maNhanVien)) {
                System.out.print("Ho va ten moi: ");
                String hoTenMoi = scanner.nextLine();
                nhanVien.setHoTen(hoTenMoi);

                System.out.print("Luong moi: ");
                double luongMoi = scanner.nextDouble();
                scanner.nextLine(); // Đọc bỏ dòng new line
                nhanVien.setLuong(luongMoi);

                capNhatThanhCong = true;
                break;
            }
        }

        if (capNhatThanhCong) {
            System.out.println("Đa cap nhat thong tin cho nhan vien co ma " + maNhanVien);
        } else {
            System.out.println("Khong tim thay nhan vien voi ma " + maNhanVien);
        }
    }

    public void timNhanVienTheoKhoangLuong() {
        System.out.print("Nhap khoang luong (tu - đen): ");
        double luongTu = scanner.nextDouble();
        double luongDen = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng new line

        System.out.println("Danh sach nhan vien trong khoang luong " + luongTu + " - " + luongDen + ":");
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getLuong() >= luongTu && nhanVien.getLuong() <= luongDen) {
                nhanVien.inThongTin();
                System.out.println();
            }
        }
    }

    public void sapXepTheoHoTen() {
        Collections.sort(danhSachNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getHoTen().compareTo(nv2.getHoTen());
            }
        });

        System.out.println("Danh sach nhan vien đa đuoc sap xep theo ho va ten:");
        for (NhanVien nhanVien : danhSachNhanVien) {
            nhanVien.inThongTin();
            System.out.println();
        }
    }

    public void sapXepTheoThuNhap() {
        Collections.sort(danhSachNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if (nv1.getLuong() < nv2.getLuong()) {
                    return 1;
                } else if (nv1.getLuong() > nv2.getLuong()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("Danh sach nhan vien đa đuoc sap xep theo thu nhap:");
        for (NhanVien nhanVien : danhSachNhanVien) {
            nhanVien.inThongTin();
            System.out.println();
        }
    }

    public void xuat5NhanVienCoThuNhapCaoNhat() {
        Collections.sort(danhSachNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if (nv1.getLuong() < nv2.getLuong()) {
                    return 1;
                } else if (nv1.getLuong() > nv2.getLuong()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("5 nhan vien co thu nhap cao nhat:");
        int count = Math.min(5, danhSachNhanVien.size());
        for (int i = 0; i < count; i++) {
            danhSachNhanVien.get(i).inThongTin();
            System.out.println();
        }
    }
}