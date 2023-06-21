
package ASM;

public class HanhChinh extends NhanVien {
    public HanhChinh(String maNhanVien, String hoTen, double luong) {
        super(maNhanVien, hoTen, luong);
    }

    // Các phương thức khác của lớp HanhChinh
    public void thucHienCongViec() {
        System.out.println("Nhan vien hanh chinh " + getHoTen() + " đang thuc hien cong viec.");
    }

    public void inThongTin() {
        System.out.println("Thong tin nhan vien hanh chinh:");
        System.out.println("Ma nhan vien: " + getMaNhanVien());
        System.out.println("Ho va ten: " + getHoTen());
        System.out.println("Luong: " + getLuong());
    }
}

