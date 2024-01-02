package ThuVien;

public class Bao extends TaiLieu{
	//Các báo cần quản lý thêm: Ngày phát hành
	int ngayPhatHanh;

	public Bao(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}
	public void xuatBao() {
		super.xuat();
		System.out.println("Ngày phát hành: "+ngayPhatHanh);
	}
	

}
