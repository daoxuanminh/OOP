package W3;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public double LUONG_MAX;

    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    // public boolean tangLuong(double value) {
    //     this.heSoLuong += value;

    // }

    public static void main(String[] args) {

    }
}
