
package ASM;


public class NhanVien {
    private String maNhanVien; // Mã nhân viên
    private String hoTen; // Họ và tên
    private double luong; // Lương nhân viên

    // Constructor để khởi tạo đối tượng NhanVien với các thông tin cần thiết.
    public NhanVien(String maNhanVien, String hoTen, double luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    // Getter và Setter cho thuộc tính maNhanVien
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    // Getter và Setter cho thuộc tính hoTen
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    // Getter và Setter cho thuộc tính luong
    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    // Phương thức getThuNhap để tính toán và trả về thu nhập của nhân viên.
    // Phương thức này thường được ghi đè (override) trong các lớp con
    // để tính thu nhập theo cách riêng cho từng loại nhân viên.
    public double getThuNhap() {
        return luong;
    }

    // Phương thức inThongTin để in ra thông tin của nhân viên.
    public void inThongTin() {
        System.out.println("Ma nhan vien: " + maNhanVien);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Luong: " + luong);
    }
}


