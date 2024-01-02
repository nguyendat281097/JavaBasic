package ThuVien;

public class TapChi extends TaiLieu{
	//Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
	int soPhatHanh;
	int thangPhatHanh;
	public TapChi(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}
	public void xuatTapChi() {
		super.xuat();
		System.out.println("Số phát hành: "+soPhatHanh);
		System.out.println("Tháng phát hành: "+thangPhatHanh);
	}
    
}
