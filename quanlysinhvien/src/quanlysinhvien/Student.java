package quanlysinhvien;

public class Student {
    private String maSV;
    private String hoTen;
    private String ngaySinh;

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSV + " | Ho Ten: " + hoTen + " | Ngay Sinh: " + ngaySinh);
    }
}