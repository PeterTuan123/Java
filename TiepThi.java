
package ASM;


public class TiepThi extends NhanVien {
    private double doanhSo; // Doanh số bán hàng
    private double hoaHong; // Tỷ lệ hoa hồng
       public TiepThi(String maNhanVien, String hoTen, double luong, double doanhSo) {
        super(maNhanVien, hoTen, luong);
        this.doanhSo = doanhSo;
       }
    // Constructor để khởi tạo đối tượng TiepThi với các thông tin cần thiết.
    public TiepThi(String maNhanVien, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(maNhanVien, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    // Getter và Setter cho thuộc tính doanhSo
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    // Getter và Setter cho thuộc tính hoaHong
    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    // Ghi đè phương thức getThuNhap để tính lại thu nhập cho nhân viên tiếp thị.
    @Override
    public double getThuNhap() {
        return super.getLuong() + (doanhSo * hoaHong);
    }

    // Ghi đè phương thức inThongTin để in ra thông tin của nhân viên tiếp thị.
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Doanh số: " + doanhSo);
        System.out.println("Tỷ lệ hoa hồng: " + hoaHong);
        System.out.println("Tổng thu nhập: " + getThuNhap());
    }
}

