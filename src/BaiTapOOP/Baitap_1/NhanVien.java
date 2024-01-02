package BaiTapOOP.Baitap_1;

public class NhanVien extends CanBo {
	// Các nhân viên có thuộc tính riêng: công việc.
	String congViec;
	public NhanVien(String hoTen, int tuoi, String gioiTinh, DiaChi diachi, String congViec) {
		super(hoTen, tuoi, gioiTinh, diachi);
		this.congViec = congViec;
	}
}
